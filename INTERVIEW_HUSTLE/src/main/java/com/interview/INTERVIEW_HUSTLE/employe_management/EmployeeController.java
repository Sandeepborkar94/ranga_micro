package com.interview.INTERVIEW_HUSTLE.employe_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping(value = "/check")
	public String helloWorld() 
	{
		return "The Application is UP and RUNNING";	
	}
	
	
	@GetMapping
	public List<Employee> getAllEmp() 
	{
		
		List<Employee> emps=employeeService.getAllEmployess();
		
		System.out.println(emps);
		
		return emps;
	}

	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee) 
	{
		System.out.println("Received POST request: " + employee);
		return employeeService.saveEmp(employee);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) 
	{
		
		return employeeService.getEmpById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmpDetails(@PathVariable String id, @RequestBody Employee updatedEmp) 
	{
		return employeeService.getEmpById(id).map(emp -> 
		{
			emp.setName(updatedEmp.getName());
			emp.setEmail(updatedEmp.getEmail());
			emp.setDepartment(updatedEmp.getDepartment());
			emp.setSalary(updatedEmp.getSalary());
			
			return ResponseEntity.ok(employeeService.saveEmp(emp));
			
		})
		.orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmp(@PathVariable String id) {
		if (employeeService.getEmpById(id).isPresent()) {
			employeeService.deleteEmp(id);

			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.notFound().build();
	}

}

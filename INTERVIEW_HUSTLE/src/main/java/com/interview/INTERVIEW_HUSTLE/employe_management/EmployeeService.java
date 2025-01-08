package com.interview.INTERVIEW_HUSTLE.employe_management;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
//	private EmployeeRepository1 employeeRepository1;

	
	public List<Employee> getAllEmployess() {
		return employeeRepository.findAll();
	}

	
	public Optional<Employee> getEmpById(String id) 
	{
		return employeeRepository.findById(id);
	}

	public Employee saveEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	public void deleteEmp(String id) {
		employeeRepository.deleteById(id);
	}

//	public List<Employee> getEmpByDept(String department)
//	{
//		return this.employeeRepository1.findByDepartment(department);
//	}
//	
//	public List<Employee> getEmpSalaryGreaterThan(String salary)
//	{
//		return this.employeeRepository1.findEmployeeWithSalaryGreaterThan(salary);
//	}
	
}

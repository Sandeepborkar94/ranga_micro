package com.interview.INTERVIEW_HUSTLE;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.interview.INTERVIEW_HUSTLE.employe_management.Employee;
import com.interview.INTERVIEW_HUSTLE.employe_management.EmployeeRepository;
import com.interview.INTERVIEW_HUSTLE.employe_management.EmployeeService;

public class EmployeeServiceTest
{
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeService employeeService;

	public EmployeeServiceTest()
	{
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testGetAllEmployees()
	{
//		 when(employeeRepository.findAll()).thenReturn(Arrays.asList(new Employee("1", "John", "Doe", "snsjds", "sdsndsd")));

		when(employeeRepository.findAll()).thenReturn(Arrays.asList(new Employee("1", "sandeep", "sandeep@gmail.com", "IT", "9000")));
		
		List<Employee> allEmployess = employeeService.getAllEmployess();
		
		assertEquals(1, allEmployess.size());
		assertEquals("sandeepborkar", allEmployess.get(0).getName());
		
		verify(employeeRepository,times(1)).findAll();
	}
	
	   @Test
	    void testGetEmployeeById() {
	        Employee employee = new Employee("1", "sandeep", "sandeep@gmail.com", "IT", "9000");
	        when(employeeRepository.findById("1")).thenReturn(Optional.of(employee));

	        Optional<Employee> result = employeeService.getEmpById("1");

	        assertNotNull(result);
	        assertEquals("sandeep", result.get());
	        verify(employeeRepository, times(1)).findById("1");
	    }

	    @Test
	    void testAddEmployee() {
	        Employee employee = new Employee("1", "sandeep", "sandeep@gmail.com", "IT", "9000");
	        when(employeeRepository.save(employee)).thenReturn(new Employee("1", "sandeep", "sandeep@gmail.com", "IT", "9000"));

	        Employee savedEmployee = employeeService.saveEmp(employee);

	        assertNotNull(savedEmployee);
	        assertEquals("1", savedEmployee.getId());
	        verify(employeeRepository, times(1)).save(employee);
	    }

	    @Test
	    void testUpdateEmployee() {
	        Employee employee = new Employee("1", "sandeep", "sandeep@gmail.com", "IT", "9000");
	        when(employeeRepository.existsById("1")).thenReturn(true);
	        when(employeeRepository.save(employee)).thenReturn(employee);

	        Employee updatedEmployee = employeeService.saveEmp(employee);

	        assertNotNull(updatedEmployee);
	        assertEquals("Alice", updatedEmployee.getName());
	        verify(employeeRepository, times(1)).save(employee);
	    }

	    @Test
	    void testDeleteEmployee() {
	        when(employeeRepository.existsById("1")).thenReturn(true);

	        employeeService.deleteEmp("1");

	        verify(employeeRepository, times(1)).deleteById("1");
	    }
	

}

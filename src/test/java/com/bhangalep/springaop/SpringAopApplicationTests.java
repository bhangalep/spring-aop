package com.bhangalep.springaop;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bhangalep.springaop.entity.Employee;
import com.bhangalep.springaop.service.EmployeeService;

@SpringBootTest
class SpringAopApplicationTests {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createEmployee() {
		Employee employee = new Employee();
		employee.setId(UUID.randomUUID().toString());
		employee.setName("Parag Bhangale");
		employeeService.saveEmployee(employee);
		
		assertTrue(employeeService.getCount() > 0);
	}
}

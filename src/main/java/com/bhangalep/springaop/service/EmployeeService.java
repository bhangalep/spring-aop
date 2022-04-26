package com.bhangalep.springaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhangalep.springaop.entity.Employee;
import com.bhangalep.springaop.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(final Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public long getCount() {
		return employeeRepository.count();
	}
}

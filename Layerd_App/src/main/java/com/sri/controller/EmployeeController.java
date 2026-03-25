package com.sri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sri.model.Employee;
import com.sri.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	public String add(Employee e) {
		return service.add(e);
	}
	public String delete(String id) {
		return service.delete(id);
	}
	public List<Employee> retrieve(){
		List<Employee>list = service.retrieve();
		return list;
	}
}

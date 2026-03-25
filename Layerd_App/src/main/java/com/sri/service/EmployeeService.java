package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.dao.EmployeeDao;
import com.sri.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public String add(Employee e) {
		int r = dao.add(e);
		if(r>0) {
			return "Employee added";
		}
		else {
			return "Employee not added";
		}
	}
	public String delete(String id) {
		int r = dao.delete(id);
		if(r>0) {
			return "Employee deleted";
		}
		else {
			return "Employee not deleted";
		}
	}
	public List<Employee> retrieve(){
		List<Employee>list = dao.retrieve();
		return list;
	}
}

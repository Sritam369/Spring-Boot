package com.sri.sbeans;

import java.util.ArrayList;
import java.util.HashMap;

public class Department {

	private String deptName;
	private ArrayList<Employee> employees;
	
	public Department(String deptName,ArrayList<Employee> employees) {
		this.deptName=deptName;
		this.employees=employees;
	}
	
	public void showDepartmentInfo() {
		IO.println("Department name: "+deptName);
		employees.forEach(info-> IO.println(info.showEmployeeDetails()));
	}
}

package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String employeeId;
	private String empName;
	private Project project;
	
	public Employee(String employeeId,String empName) {
		this.employeeId=employeeId;
		this.empName=empName;
	}
	
	@Autowired
	public void setProject(Project project) {
		this.project=project;
	}
	
	public String showEmployeeDetails() {
		return "employee id: "+employeeId+", employee name: "+empName+", project: "+project.showProjectDetails()+"";
	}
}

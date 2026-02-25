package com.sri.sbeans;

import java.util.HashMap;

public class Company {

	private String companyName;
	private HashMap<String,Department> departments;
	
	public Company(String companyName,HashMap<String,Department> departments) {
		this.companyName=companyName;
		this.departments=departments;
	}
	
	public void showCompanyInfo() {
		IO.println("company name: "+companyName); 
        departments.forEach((k,v)->v.showDepartmentInfo());
		
	}
}

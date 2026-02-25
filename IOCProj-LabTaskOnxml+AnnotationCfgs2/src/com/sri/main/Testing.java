package com.sri.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sri.sbeans.Company;

public class Testing {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sri/cfgs/ApplicationContext.xml");
		Company c = ctx.getBean(Company.class);
		c.showCompanyInfo();
	}

}

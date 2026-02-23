package com.sri.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sri.comp.NewYearAlert;

public class NewYear {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sri/cfgs/appContext3.xml");
		NewYearAlert ny = ctx.getBean(null)
	}

}

package com.sri.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sri.comp.WeekDayAnalyzer;

public class Testing {

	public static void main(String[] args) {
	  FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sri/cfgs/appContext.xml");
	  WeekDayAnalyzer generate=ctx.getBean("wda",WeekDayAnalyzer.class);
	  IO.println(generate.showMsg());
	}

}

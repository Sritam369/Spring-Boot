package com.sri.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sri.comp.MonthEndReminder;

public class MonthEnd {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sri/cfgs/appContext2.xml");
		MonthEndReminder remind = ctx.getBean("mer",MonthEndReminder.class);
		IO.println(remind.show());
	}

}

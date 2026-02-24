package com.sri.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sri.sbeans.Engine;
import com.sri.sbeans.ServiceCenter;
import com.sri.sbeans.Tyre;

public class Testing {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sri/cfgs/ApplicationContext.xml");
		Tyre t = ctx.getBean(Tyre.class);
		t.setBrand("mrf");
		t.setSize("200");
		
		ServiceCenter sc = ctx.getBean(ServiceCenter.class);
		IO.println(sc.performService("full engine checkup"));
	}

}

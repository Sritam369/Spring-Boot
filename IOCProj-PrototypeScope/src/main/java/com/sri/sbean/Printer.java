package com.sri.sbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("p")
@Scope("prototype")
public class Printer {

	private static Printer INSTANCE;
	
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}

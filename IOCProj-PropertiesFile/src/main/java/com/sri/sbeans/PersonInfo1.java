package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("p")
public class PersonInfo1 {

	@Autowired
	private Environment env;
	
	public void showDetails() {
		System.out.println("os name: "+env.getProperty("os.name"));
		System.out.println("Person name: "+env.getProperty("per.name"));
		System.out.println("Person id: "+env.getProperty("per.id"));
		System.out.println("Person address: "+env.getProperty("per.address"));
		System.out.println("Mobile: "+env.getProperty("mobile"));
	}
}

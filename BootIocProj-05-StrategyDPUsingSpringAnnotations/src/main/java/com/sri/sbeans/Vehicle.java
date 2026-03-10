package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("petrol")
	private Engine engine;
	
	public void run() {
		engine.start();
		IO.println("Journey is going on......");
		engine.stop();
	}
}

package com.sri.sbeans2;

import org.springframework.stereotype.Component;

@Component("car")
class Car implements Vehicle{

	public void assemble() {
		IO.println("Assembling a car with automatic transmission");		
	}

}

package com.sri.sbeans2;

import org.springframework.stereotype.Component;

@Component("bike")
class Bike implements Vehicle{

	public void assemble() {
		IO.println("Assembling a bike with lightweight alloy frame");		
	}

}

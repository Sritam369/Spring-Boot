package com.sri.sbeans2;

import org.springframework.stereotype.Component;

@Component("truck")
class Truck implements Vehicle{

	public void assemble() {
		IO.println("Assembling a truck with heavy duty engine");		
	}

}

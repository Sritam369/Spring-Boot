package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("washingmachine")
public class WashingMachine implements Appliance{

	@Override
	public void manufacture() {
		IO.println("Manufacturing washing machine with smart sensor");
		
	}

}

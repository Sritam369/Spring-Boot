package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("refrigerator")
public class Refrigerator implements Appliance {

	@Override
	public void manufacture() {
		IO.println("Manufacturing refrigerator with inverter technology");
		
	}

}

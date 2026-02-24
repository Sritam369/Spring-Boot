package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Engine {

	private String engineType;
	private String horsePower;
	
	public Engine(String engineType,String horsePower) {
		this.engineType=engineType;
		this.horsePower=horsePower;
	}
	
	public String showEngineDewtails() {
		return "Engine Details: Type="+engineType+" , horsepower="+horsePower+"";
	}
}

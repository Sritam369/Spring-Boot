package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{

	
	private Engine engineType;
	private String doors;
	
	
	public void setEngineType(Engine engineType) {
		this.engineType=engineType;
	}
	
	public String getDescription() {
		return "Car is running with "+engineType.getEngineType()+"";
	}
}

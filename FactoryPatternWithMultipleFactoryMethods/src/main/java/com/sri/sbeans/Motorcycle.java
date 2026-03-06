package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("motor cycle")
public class Motorcycle implements Vehicle{

	
	private Engine engineType;
	private boolean sideCar;
	
	
	public void setEngineType(Engine engineType) {
		this.engineType=engineType;
	}
	@Override
	public String getDescription() {
		return "Motorcycle is running with "+engineType.getEngineType()+"";
	}
	
}

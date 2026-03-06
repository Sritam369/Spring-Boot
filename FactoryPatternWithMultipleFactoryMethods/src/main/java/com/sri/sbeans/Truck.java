package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Vehicle{

	
	private Engine engineType;
	private String payload;
	
	public void setEngineType(Engine engineType) {
		this.engineType=engineType;
	}
	
	@Override
	public String getDescription() {
		return "Truck is running with "+engineType.getEngineType()+"";
	}
}

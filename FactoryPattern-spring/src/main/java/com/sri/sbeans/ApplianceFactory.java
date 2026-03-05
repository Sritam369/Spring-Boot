package com.sri.sbeans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("af")
public class ApplianceFactory {

	@Autowired
	private Map<String,Appliance>map = new HashMap<>();
	
	public Appliance getAppliance(String type){
	   Appliance app = map.get(type);
	   return app;
	}
}

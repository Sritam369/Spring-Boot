package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sc")
public class ServiceCenter {

	@Autowired
	private Vehicle vehicle;
	private String serviceType;
	
	public String performService(String type) {
		this.serviceType=type;
		return "vehicle:"+vehicle.displayVehicleInfo()+",service type:"+serviceType+"";
	}
}

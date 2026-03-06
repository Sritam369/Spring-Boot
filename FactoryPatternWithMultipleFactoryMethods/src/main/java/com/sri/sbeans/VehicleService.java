package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vs")
public class VehicleService {

	@Autowired
	private VehicleFactory vehicleFactory;
	
	public void createVehicle(String type,String engineType) {
		Vehicle v = vehicleFactory.createVehicle(type, engineType);
		IO.println(v.getDescription());
	}
	
}

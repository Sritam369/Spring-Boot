package com.sri.sbeans2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vf")
public class VehicleFactory {

	@Autowired
	private Map<String, Vehicle> vehicle;
	

	public Vehicle getVehicle(String type) {
		Vehicle v = vehicle.get(type);
		return v;
	}
}

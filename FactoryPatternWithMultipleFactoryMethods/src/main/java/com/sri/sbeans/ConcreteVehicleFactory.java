package com.sri.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vf")
public class ConcreteVehicleFactory implements VehicleFactory{
	
	@Autowired
	private Map<String,Vehicle>map;
	@Autowired
	private Map<String,Engine>map2;
	
	public Vehicle createVehicle(String type,String engineType) {
		Vehicle v = map.get(type);
		Engine e = map2.get(engineType);
		if(v instanceof Car car) {
			car.setEngineType(e);
		}
		if(v instanceof Truck truck) {
			truck.setEngineType(e);
		}
		if(v instanceof Motorcycle mc) {
			mc.setEngineType(e);
		}
		return v;
	}
}

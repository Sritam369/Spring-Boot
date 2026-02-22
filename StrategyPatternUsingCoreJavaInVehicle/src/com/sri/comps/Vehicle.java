package com.sri.comps;

public class Vehicle {

	private Engine engine;
	public Vehicle(Engine engine) {
		this.engine=engine;
	}
	
	public String running() {
		String msg=engine.run();
		return "Vehicle is running with "+msg+"";
	}
}

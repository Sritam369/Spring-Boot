package com.sri.sbeans;

public class Vehicle {

	private String vehicleName;
	private Engine engine;
	private Tyre tyre;
	
	public Vehicle(String vehicleName, Engine engine) {
		super();
		this.vehicleName = vehicleName;
		this.engine = engine;
	}

	public void setTyre(Tyre tyre) {
		this.tyre=tyre;
	}
	
	public String displayVehicleInfo() {		
		return "vehicle name: "+vehicleName+", engine:"+engine.showEngineDewtails()+",tyre:"+tyre.showTyreDetails()+"";
	}
}

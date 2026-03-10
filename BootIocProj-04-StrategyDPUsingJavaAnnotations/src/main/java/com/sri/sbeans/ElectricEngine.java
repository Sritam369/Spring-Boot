package com.sri.sbeans;

import jakarta.inject.Named;

@Named("ee")
public class ElectricEngine implements Engine {

	public void start() {
		IO.println("Electric engine started");
	}

	public void stop() {
		IO.println("Electric engine stopped");
	}

}

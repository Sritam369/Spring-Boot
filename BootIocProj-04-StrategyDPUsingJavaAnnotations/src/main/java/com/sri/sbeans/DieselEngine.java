package com.sri.sbeans;

import jakarta.inject.Named;

@Named("diesel")
public class DieselEngine implements Engine {

	@Override
	public void start() {
		IO.println("Diesel engine started");
	}

	@Override
	public void stop() {
		IO.println("Diesel engine stopped");
	}

}

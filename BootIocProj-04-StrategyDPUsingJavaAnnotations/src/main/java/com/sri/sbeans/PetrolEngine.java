package com.sri.sbeans;

import jakarta.inject.Named;

@Named("petrol")
public class PetrolEngine implements Engine {

	@Override
	public void start() {
		IO.println("Petrol engine started");
	}

	@Override
	public void stop() {
		IO.println("Petrol engine stopped");
	}

}

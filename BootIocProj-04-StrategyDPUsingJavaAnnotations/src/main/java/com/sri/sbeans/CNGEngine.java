package com.sri.sbeans;

import jakarta.inject.Named;

@Named("cng")
public class CNGEngine implements Engine {

	@Override
	public void start() {
		IO.println("CNG engine started");

	}

	@Override
	public void stop() {
		IO.println("CNG engine stopped");

	}

}

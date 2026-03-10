package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("cng")
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

package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("ee")
public class ElectricEngine implements Engine {

	public void start() {
		IO.println("Electric engine started");
	}

	public void stop() {
		IO.println("Electric engine stopped");
	}

}

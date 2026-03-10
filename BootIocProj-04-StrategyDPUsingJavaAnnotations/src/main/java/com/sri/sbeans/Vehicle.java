package com.sri.sbeans;

import jakarta.annotation.Resource;
import jakarta.inject.Named;

@Named("vehicle") // alternate for @Component
public class Vehicle {

    @Resource(name="petrol") // alternate for autowired+qualifier
    // @Inject is alternate for @Autowired
	private Engine engine;
	
	public void run() {
		engine.start();
		IO.println("Journey is going on......");
		engine.stop();
	}
}

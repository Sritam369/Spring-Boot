package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.Vehicle;

@SpringBootApplication
public class BootIocProj04StrategyDpUsingJavaAnnotationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj04StrategyDpUsingJavaAnnotationsApplication.class, args);
		Vehicle v = ctx.getBean(Vehicle.class);
		v.run();
	}

}

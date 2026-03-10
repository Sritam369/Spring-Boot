package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.Vehicle;

@SpringBootApplication
public class BootIocProj07StrategyDpWithLooseCouplingUsingFactoryBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj07StrategyDpWithLooseCouplingUsingFactoryBeanApplication.class, args);
		Vehicle bean = ctx.getBean("vehicle",Vehicle.class);
		bean.run();
	}

}

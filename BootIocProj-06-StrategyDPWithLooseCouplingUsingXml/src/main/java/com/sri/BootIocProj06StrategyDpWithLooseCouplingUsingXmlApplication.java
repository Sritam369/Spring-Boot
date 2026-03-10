package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sri.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/sri/cfgs/applicationContext.xml")
public class BootIocProj06StrategyDpWithLooseCouplingUsingXmlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj06StrategyDpWithLooseCouplingUsingXmlApplication.class, args);
		Vehicle bean = ctx.getBean("vehicle",Vehicle.class);
		bean.run();
	}

}

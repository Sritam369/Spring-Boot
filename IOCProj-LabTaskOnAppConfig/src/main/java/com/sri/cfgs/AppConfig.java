package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sri.sbean.EmiCalculator;

@Configuration
public class AppConfig {

	@Bean(name="emi")
	public EmiCalculator calculate() {
		return new EmiCalculator(60000,10000,10);
	}
}

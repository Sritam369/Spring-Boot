package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sri.sbeans.CommercialBilling;
import com.sri.sbeans.IndustrialBilling;
import com.sri.sbeans.ResidentialBilling;

@Configuration
@ComponentScan(basePackages="com.sri.sbeans")
public class AppConfig {

	@Bean(name="rsb")
	public ResidentialBilling rb() {
		return new ResidentialBilling();
	}
	@Bean(name="csb")
	public CommercialBilling rb2() {
		return new CommercialBilling();
	}
	@Bean(name="isb")
	public IndustrialBilling rb3() {
		return new IndustrialBilling();
	}
}

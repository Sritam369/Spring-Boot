package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sri.sbeans.EliteCustomerDiscoount;
import com.sri.sbeans.PremiumCustomerDiscount;
import com.sri.sbeans.RegularCustomerDiscount;

@Configuration
@ComponentScan(basePackages="com.sri.sbeans")
public class AppConfig {

	@Bean(name="rgs")
	public RegularCustomerDiscount rcs() {
		return new RegularCustomerDiscount();
	}
	@Bean(name="pgs")
	public PremiumCustomerDiscount rcs2() {
		return new PremiumCustomerDiscount();
	}
	@Bean(name="egs")
	public EliteCustomerDiscoount rcs3() {
		return new EliteCustomerDiscoount();
	}
}

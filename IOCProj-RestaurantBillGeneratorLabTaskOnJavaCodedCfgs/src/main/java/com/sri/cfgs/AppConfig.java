package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sri.sbean.RestaurantBillGenerator;

@Configuration
@ComponentScan(basePackages="com.sri.sbean")
public class AppConfig {

	@Bean(name="rbg")
	public RestaurantBillGenerator generate() {
		RestaurantBillGenerator res = new RestaurantBillGenerator();
		res.setFoodAmount(800);
		res.setDrinksAmount(200);
		res.setServiceCharge(50);
		res.setGstPercentage(18);
		
		return res;
	}
}

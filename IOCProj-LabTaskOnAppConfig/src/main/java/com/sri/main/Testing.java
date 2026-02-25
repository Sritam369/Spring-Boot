package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbean.EmiCalculator;

public class Testing {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmiCalculator e = ctx.getBean("emi",EmiCalculator.class);
		e.calculateMonthlyEmi();
	}

}

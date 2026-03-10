package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.DiscountCalculator;

@SpringBootApplication
public class BootIocProj01DependencyInjectionDiscountCalculationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootIocProj01DependencyInjectionDiscountCalculationApplication.class, args);
		DiscountCalculator bean = run.getBean("dc",DiscountCalculator.class);
		double price = Double.parseDouble(IO.readln("Enter total price"));
		double percentage = Double.parseDouble(IO.readln("Enter discount percentage"));
		IO.println(bean.applyDiscount(price, percentage));
	}

}

package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.DiscountPercentageCalculation;

@SpringBootApplication
public class BootIocProj13ValueAnnotationSpelApplication03Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj13ValueAnnotationSpelApplication03Application.class, args)){
			DiscountPercentageCalculation bean = ctx.getBean("dpc",DiscountPercentageCalculation.class);
			IO.println(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

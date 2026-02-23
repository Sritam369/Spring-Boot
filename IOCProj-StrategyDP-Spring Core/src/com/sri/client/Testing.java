package com.sri.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.Flipkart;

public class Testing {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
		Flipkart fp = ctx.getBean("fkt",Flipkart.class);
		IO.println (fp.shopping(new String[] {"mobile","laptop"}, new double[] {25000,75000}));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

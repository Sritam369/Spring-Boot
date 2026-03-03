package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.PaymentProcessor;

public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	 PaymentProcessor p =ctx.getBean("pp",PaymentProcessor.class);
    	 p.processPayment(2500);
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
}
}
package com.sri.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.BillingService;
import com.sri.sbeans.DiscountStrategy;

public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter bean id");
    	   DiscountStrategy bean = (DiscountStrategy)ctx.getBean(sc.next());
    	 BillingService b = ctx.getBean("bs",BillingService.class);
    	 b.setDiscount(bean);
    	  	 
    	 b.generateBill(2000);
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}

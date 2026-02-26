package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbean.RestaurantBillGenerator;

public class BillTester {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class))
       {
    	   RestaurantBillGenerator res = ctx.getBean("rbg",RestaurantBillGenerator.class);
    	   System.out.println(res.generateBill());
       }
       catch(Exception e)
       {    
    	  e.printStackTrace(); 
       }
       
}
}
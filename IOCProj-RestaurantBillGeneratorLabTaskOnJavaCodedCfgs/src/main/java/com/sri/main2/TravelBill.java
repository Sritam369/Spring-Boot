package com.sri.main2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs2.AppConfig2;
import com.sri.sbean2.TravelPackageCostCalculator;

public class TravelBill {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class))
	       {
	    	   TravelPackageCostCalculator res = ctx.getBean("tpc",TravelPackageCostCalculator.class);
	    	   System.out.println(res.calculateFinalPackageCost());
	       }
	       catch(Exception e)
	       {    
	    	  e.printStackTrace(); 
	       }
	}

}

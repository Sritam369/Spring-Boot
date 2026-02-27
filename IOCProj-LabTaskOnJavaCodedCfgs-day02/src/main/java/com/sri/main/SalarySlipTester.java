package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbean.SalarySlipService;

public class SalarySlipTester {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	 SalarySlipService ss = ctx.getBean("ss",SalarySlipService.class); 
    	 ss.calculate();
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}

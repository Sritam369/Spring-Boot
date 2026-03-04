package com.sri.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.BillingStrategy;
import com.sri.sbeans.ElectricityBillingSystem;

public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	Scanner sc=new Scanner(System.in);
     	   System.out.println("Enter bean id");
           BillingStrategy bean =(BillingStrategy) ctx.getBean(sc.next());
           ElectricityBillingSystem e = ctx.getBean("ebs",ElectricityBillingSystem.class);
           e.setBill(bean);
           e.showBill(500);
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.LaptopService;

public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	LaptopService l = ctx.getBean("ls",LaptopService.class);
        	l.printLaptopDetails();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.sri.config.AppConfig;
import com.sri.sbeans.PersonInfo1;

public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class)){
    	PersonInfo1 pi = ctx.getBean("p",PersonInfo1.class);
    	Environment env = ctx.getEnvironment();
    	System.out.println(env.getProperty("per.id"));
    	pi.showDetails();
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}

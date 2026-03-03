package com.sri.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.ShoppingContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ShoppingContext s = ctx.getBean("sc",ShoppingContext.class);
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("1. add cart");
        System.out.println("2. view cart");
        System.out.println("3. checkout");
        System.out.println("4. exit");
        System.out.println("provide a choice");
        int choice=Integer.parseInt(sc.next());
        switch(choice) {
        case 1->{
        	
        	System.out.println("provide item");
        	String item = sc.next();
        	System.out.println("provide price");
        	Double price = Double.parseDouble(sc.next());
        	s.service(item,price);
        }
        case 2->{
        	s.view();
        }
        case 3->{
        	s.check();
        }
        case 4->{
        	System.exit(0);
        }
        default->{
        	System.out.println("Wrong choice");
        }
        }
        }
        
    }
}

package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.CarLoanInterest;
import com.sri.sbeans.HomeLoanInterest;
import com.sri.sbeans.InterestStrategy;
import com.sri.sbeans.LoanService;

public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	LoanService l = ctx.getBean("ls",LoanService.class);
        	String type = IO.readln("choose type: home/car");
        	double amount = Double.parseDouble(IO.readln("Enter amount"));
        	if(type.equals("car")) {
        	InterestStrategy i = ctx.getBean("car",CarLoanInterest.class);
        	l.setInterest(i);
        	l.processLoan(amount);
        	
        	}
        	else {
        		InterestStrategy i = ctx.getBean("home",HomeLoanInterest.class);
            	l.setInterest(i);
            	l.processLoan(amount);
        	}
        	
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

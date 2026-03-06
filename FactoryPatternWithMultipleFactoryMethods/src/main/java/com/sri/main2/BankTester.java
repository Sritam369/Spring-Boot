package com.sri.main2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs2.AppConfig2;
import com.sri.sbeans2.Bank;
import com.sri.sbeans2.Customer;
import com.sri.sbeans2.HDFC;
import com.sri.sbeans2.SBI;

public class BankTester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
		Customer c = ctx.getBean("cust",Customer.class);
		c.setCustomerId(101);
		c.setName("sritam");
		String type=IO.readln("enter bank type: sbi/hdfc");
		if(type.equals("sbi")) {
		Bank b = ctx.getBean("sbi",SBI.class);
		c.setBank(b);
		double amount = Double.parseDouble(IO.readln("enter deposit amount"));
		c.deposit(amount);
		double amount2 = Double.parseDouble(IO.readln("enter withdrawl amount"));
		c.withdraw(amount2);
		c.display();
		}
		else if(type.equals("hdfc")) {
			Bank b = ctx.getBean("hdfc",HDFC.class);
			c.setBank(b);
			double amount = Double.parseDouble(IO.readln("enter deposit amount"));
			c.deposit(amount);
			double amount2 = Double.parseDouble(IO.readln("enter withdrawl amount"));
			c.withdraw(amount2);
			c.display();
		}
		else {
			IO.println("Invalid bank name");
		}
	}

}

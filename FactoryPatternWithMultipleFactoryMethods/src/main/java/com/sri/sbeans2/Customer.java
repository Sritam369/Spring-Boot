package com.sri.sbeans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {

	private int custId;
	private String name;
	private Bank bank;
	@Autowired
	private BankFactory bankFactory;
	
	public void setCustomerId(int custId) {
		this.custId=custId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBank(Bank bank) {
		this.bank=bank;
	}
	
	public void deposit(double amount) {
		bank.deposit(amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(amount);
	}
	
	public void display() {
		IO.println("id: "+custId);
		IO.println("name: "+name);
		IO.println("Bank name: "+bank.toString());
	
	}
}

package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("br")
public class BankRunner {

	@Autowired
	private BankAccount acc;
	
	@Value("#{ba.balance>0}")
	private boolean validate;
	
	public void run() {
	
	if(!validate) {
		IO.println("Balance can't be negative");
		return;
	}
	else {
		IO.println(acc.getAccNumber());
		IO.println(acc.getHolderName());
		IO.println(acc.getBalance());
	}
	}
}

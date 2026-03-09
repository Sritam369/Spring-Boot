package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("ls")
public class LoanService {
 
	private InterestStrategy interest;
	
	public void setInterest(InterestStrategy interest) {
		this.interest=interest;
	}
	
	public void processLoan(double amount) {
		interest.calculateInterest(amount);
	}
}

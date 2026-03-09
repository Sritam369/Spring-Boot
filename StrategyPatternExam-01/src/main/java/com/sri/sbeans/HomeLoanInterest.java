package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("home")
public final class HomeLoanInterest implements InterestStrategy{

	@Override
	public double calculateInterest(double amount) {
      double interest = amount*0.07;
      IO.println("Loan amount : "+amount);
      IO.println("interest amount : "+interest);   
		return interest;
	}

}

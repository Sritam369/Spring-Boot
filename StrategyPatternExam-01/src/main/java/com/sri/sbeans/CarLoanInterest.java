package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("car")
public final class CarLoanInterest implements InterestStrategy{

	@Override
	public double calculateInterest(double amount) {
      double interest = amount*0.09;
      IO.println("Loan amount : "+amount);
      IO.println("interest amount : "+interest);     
		return interest;
	}

}

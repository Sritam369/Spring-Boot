package com.sri.sbeans2;

import org.springframework.stereotype.Component;

@Component("tax")
public class TaxCalculator {

	public double calculateTax(double amount) {
		return amount*0.18;
	}
}

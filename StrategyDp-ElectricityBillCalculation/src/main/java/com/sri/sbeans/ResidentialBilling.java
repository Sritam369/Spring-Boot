package com.sri.sbeans;

public class ResidentialBilling implements BillingStrategy{

	public double calculateBill(double units) {
		System.out.println("rate.5 per unit");
		return units*5;
	}

}

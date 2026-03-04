package com.sri.sbeans;

public class IndustrialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
		System.out.println("rate.10 per unit");
		return units*10;
	}

}

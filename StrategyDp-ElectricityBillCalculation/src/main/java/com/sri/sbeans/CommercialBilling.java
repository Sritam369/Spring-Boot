package com.sri.sbeans;

public class CommercialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
		System.out.println("rate.8 per unit");
		return units*8;
	}

}

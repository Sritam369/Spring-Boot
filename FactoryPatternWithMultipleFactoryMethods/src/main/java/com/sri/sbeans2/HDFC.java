package com.sri.sbeans2;

import org.springframework.stereotype.Component;

@Component("hdfc")
public class HDFC implements Bank{
	private double amount;

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount=amount;
	}

	@Override
	public String deposit(double amount) {
		this.amount+=amount;
		return amount+" rs deposited in account";
	}

	@Override
	public String withdraw(double amount) {
		this.amount-=amount;
		return amount+" rs withdrawn successfully!!!";
	}

	@Override
	public String toString() {
		return "HDFC [amount=" + amount + "]";
	}
}

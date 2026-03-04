package com.sri.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ss")
public class SalarySlipService {

	@Autowired
	private Employee employee;
	
	public void calculate() {
		double grossSalary = employee.getBasicSalary()+employee.getHra()+employee.getDa();
		double taxAmount = (grossSalary*employee.getTaxPercentage())/100;
		double netSalary = grossSalary-taxAmount;
		
		IO.println(grossSalary);
		IO.println(taxAmount);
		IO.println(netSalary);
	}
}

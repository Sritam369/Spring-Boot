package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ys")
@Data
public class YearlySalaryCalculation {
	
	@Autowired
	private EmployeeDetails ed;
	@Value("#{ed.salary*12+ed.bonus}")
	private double ySal;
	
}

package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ed")
@Data
public class EmployeeDetails {
	@Value("${emp.id}")
	private int id;
	@Value("${emp.name}")
	private String name;
	@Value("${emp.sal}")
	private double salary;
	@Value("${emp.bonus}")
	private double bonus;
}

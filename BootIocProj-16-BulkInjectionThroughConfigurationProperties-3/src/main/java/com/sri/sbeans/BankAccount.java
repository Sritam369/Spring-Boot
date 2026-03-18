package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ba")
@Data
@ConfigurationProperties(prefix="bank.acc")
public class BankAccount {

	private long accNumber;
	private String holderName;
	private double balance;
}

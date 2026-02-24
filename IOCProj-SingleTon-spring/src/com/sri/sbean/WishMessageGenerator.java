package com.sri.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {

	@Autowired
	@Qualifier("ldate")
	private LocalDate date;
	
	public String show() {
		
		return "now";
	}
}

package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("eo")
public class EvenOddChecker {

	public String check(int number) {
		if(number%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
}

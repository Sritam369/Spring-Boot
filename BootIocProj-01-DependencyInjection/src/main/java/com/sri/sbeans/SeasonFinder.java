package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	public String getSeason(int month) {
		if(month<=1 || month>=3) {
			return "Summer";
		}
		else if(month<=4 || month>=6) {
			return "Rainy";
		}
		else if(month<=7 || month>=9) {
			return "Winter";
		}
		else if(month<=10 || month>=12) {
			return "Spring";
		}
		else {
			return "Invalid month";
		}
	}
}

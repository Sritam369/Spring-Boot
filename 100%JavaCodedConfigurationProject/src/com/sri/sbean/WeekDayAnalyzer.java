package com.sri.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class WeekDayAnalyzer {
	
private LocalDate date;

public WeekDayAnalyzer() {
	
}

@Autowired
public void setDate(LocalDate date) {
	this.date = date;
}

public String showMessage(String user) {
	int wno = date.getDayOfWeek().getValue();
	if(wno>=1&&wno<=5) {
		return "Happy working day "+user;
	}
	else {
		return "Happy Weekend "+user;
	}
}
    
}

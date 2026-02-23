package com.sri.comp;

import java.time.LocalDate;

public class MonthEndReminder {
 private LocalDate date;
 
 public MonthEndReminder(LocalDate date) {
	 this.date = date;
 }
 
 public String show() {
	int day = LocalDate.now().getDayOfMonth();
	if(day>=30 && day<=31) {
		return "Month is ending. Please submit report";
	}
	else {
		return "Month is ending. Please submit report";
	}
 }
}

package com.sri.comp;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekDayAnalyzer {
  private LocalDate date;
  
  public WeekDayAnalyzer(LocalDate date) {
	  this.date = date;
  }
  
  public String showMsg() {
	 int day = LocalDate.now().getDayOfWeek().getValue();
	 
	 if(day==6 || day==7) {
		 return "It's Weekend";
	 }
	 else {
		 return "It's WeekDay";
	 }
  }
}

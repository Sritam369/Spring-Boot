package com.sri.comp;

import java.time.LocalDate;

public class NewYearAlert {
  private LocalDate date;
  public NewYearAlert(LocalDate date) {
	  this.date=date;
  }
  public String show() {
	 int month =  LocalDate.now().getMonth().getValue();
	 if(month==1) {
		 return "Happy New Year!!!";
	 }
	 else if(month==12) {
		 return "Get Ready for New Year";
	 }
	 else if(month>=2 && month <=11) {
		 return "Regular Month";
	 }
	 else {
		 return "Wrong month number";
	 }
  }
}

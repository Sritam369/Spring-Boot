package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGeneratorThroughConstructor {
 private LocalTime time;
 private LocalDate date;
 private int age;
public WishMessageGeneratorThroughConstructor(LocalTime time, LocalDate date, int age) {
	super();
	this.time = time;
	this.date = date;
	this.age = age;
}
@Override
public String toString() {
	return "WishMessageGeneratorThroughConstructor [time=" + time + ", date=" + date + ", age=" + age + "]";
}
 
public String showMessage(String user) {
	int hour = time.getHour();
	if(hour<12) {
		   return "Good Morning "+user;
	   }
	   else if(hour<16) {
		   return "Good Afternoon "+user;
	   }
	   else if(hour<20) {
		   return "Good Evening "+user;
	   }
	   else {
		   return "Good Night "+user;
	   }
	
}
 
}

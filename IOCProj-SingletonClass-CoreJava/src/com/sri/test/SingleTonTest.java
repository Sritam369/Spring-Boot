package com.sri.test;

import com.sri.ston.Printer;

public class SingleTonTest {

	public static void main(String[] args) {
		
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		IO.println(p1.hashCode());
		IO.println(p2.hashCode());		
	}
}

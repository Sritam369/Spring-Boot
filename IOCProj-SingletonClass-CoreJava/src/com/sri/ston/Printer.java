package com.sri.ston;

public class Printer {

	private static Printer INSTANCE;
	private Printer() {
		
	}
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
			
		}
		return INSTANCE;
	}
	public void print(String msg) {
		IO.println(msg);
	}
}

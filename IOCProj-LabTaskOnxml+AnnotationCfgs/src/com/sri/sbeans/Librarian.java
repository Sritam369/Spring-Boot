package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Librarian {

	private Library library;
	private String empName;
	
	public Librarian(String empName) {
		this.empName=empName;
	}
	@Autowired
	public void setLibrary(Library lib) {
		this.library=lib;
	}
	public void manage() {
		library.showLibrary();
		IO.println("Employee name: "+empName);
	}
}

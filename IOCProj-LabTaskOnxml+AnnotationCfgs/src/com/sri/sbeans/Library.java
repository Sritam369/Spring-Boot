package com.sri.sbeans;

import java.util.ArrayList;

public class Library {

	private String libraryName;
	private ArrayList<Book> books;
	
	public Library(String libraryName,ArrayList<Book> books) {
		this.libraryName=libraryName;
		this.books=books;
	}
	public void showLibrary() {
		IO.println("Library name: "+libraryName);
		books.forEach(b->IO.println(b.displayBookDetails()));
	}
}

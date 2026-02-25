package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;


public class Book {

	private String title;
	private String bookId;
	private Author author;
	
	public Book(String title,String bookId) {
		this.title=title;
		this.bookId=bookId;
	}
	@Autowired
	public void setAuthor(Author author) {
		this.author=author;
	}
	public String displayBookDetails() {
		return "title: "+title+", bookId: "+bookId+", author: "+author.display()+"";
	}
}

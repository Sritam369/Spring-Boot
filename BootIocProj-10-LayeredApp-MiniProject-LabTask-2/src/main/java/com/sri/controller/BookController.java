package com.sri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sri.model.Book;
import com.sri.service.IBookService;

@Controller
public class BookController {

	@Autowired
	private IBookService service;
	
	public int addBook(Book b)throws Exception{
		return service.addBook(b);
	}
	public List<Book> RetrieveAllBook()throws Exception{
		return service.retrieveAllBooks();
	}
	public int deleteBook(int id)throws Exception{
		return service.deleteBook(id);
	}
	public int updateBook(Book b)throws Exception{
		return service.updateBook(b);
	}
}

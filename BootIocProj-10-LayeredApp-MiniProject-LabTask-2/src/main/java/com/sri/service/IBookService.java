package com.sri.service;

import java.util.List;

import com.sri.model.Book;

public interface IBookService {
	int addBook(Book b) throws Exception;
	List<Book> retrieveAllBooks() throws Exception;
	int deleteBook(int bookId)throws Exception;
	int updateBook(Book b)throws Exception;
}

package com.sri.dao;

import java.util.List;

import com.sri.model.Book;

public interface IBookDao {

	int insertBook(Book b) throws Exception;
	List<Book> getAllBooks() throws Exception;
	int deleteBook(int bookId)throws Exception;
	int updateBook(Book b)throws Exception;
}

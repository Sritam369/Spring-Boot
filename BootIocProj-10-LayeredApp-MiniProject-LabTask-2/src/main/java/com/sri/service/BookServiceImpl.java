package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.dao.IBookDao;
import com.sri.model.Book;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookDao dao;

	@Override
	public int addBook(Book b) throws Exception {
		int insertBook = dao.insertBook(b);
		if(insertBook>0) {
			IO.println("Book data inserted");
		}
		else {
			IO.println("Book data not inserted");
		}
		return insertBook;
	}

	@Override
	public List<Book> retrieveAllBooks() throws Exception {
		List<Book> allBooks = dao.getAllBooks();
		allBooks.forEach(book->{
			IO.println(book.getId());
			IO.println(book.getTitle());
			IO.println(book.getAuthor());
			IO.println(book.getPrice());
		});
		
		return allBooks;
	}


	@Override
	public int deleteBook(int bookId) throws Exception {
		int delete = dao.deleteBook(bookId);
		if(delete>0) {
			IO.println("Book data deleted");
		}
		else {
			IO.println("Book data not deleted");
		}
		return delete;
	}

    @Override
	public int updateBook(Book b) throws Exception {
		int update = dao.updateBook(b);
		if(update>0) {
			IO.println("Book data updated");
		}
		else {
			IO.println("Book data not updated");
		}
		return update;
		}

}

package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.controller.BookController;
import com.sri.model.Book;

@SpringBootApplication
public class BootIocProj10LayeredAppMiniProjectLabTask2Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj10LayeredAppMiniProjectLabTask2Application.class, args)){
			Book b = new Book();
			BookController bean = ctx.getBean(BookController.class);
			while(true) {
				IO.println("1. add books");
				IO.println("2. retrieve all books");
				IO.println("3. update books");
				IO.println("4. delete books");
				IO.println("5. exit");
				
				
				int choice = Integer.parseInt(IO.readln("enter your choice"));
				switch(choice) {
				case 1->{ 
					String title = IO.readln("enter book title");
					String author = IO.readln("enter book author name");
					double price = Double.parseDouble(IO.readln("enter price"));
					b.setTitle(title);
					b.setAuthor(author);
					b.setPrice(price);
					bean.addBook(b);					
				}
				case 2->{
					bean.RetrieveAllBook();
				}
				case 3->{
					int id = Integer.parseInt(IO.readln("enter id"));
					String title = IO.readln("enter book title");
					String author = IO.readln("enter book author name");
					double price = Double.parseDouble(IO.readln("enter price"));
					b.setId(id);
					b.setTitle(title);
					b.setAuthor(author);
					b.setPrice(price);
					
					bean.updateBook(b);
				}
				case 4->{
					int id = Integer.parseInt(IO.readln("enter id"));
					b.setId(id);
					bean.deleteBook(id);
				}
				case 5->{
					System.exit(0);
				}
				default->{
					IO.println("Invalid choice");
				}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

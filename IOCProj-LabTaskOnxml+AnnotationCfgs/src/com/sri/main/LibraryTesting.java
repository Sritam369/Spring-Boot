package com.sri.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sri.sbeans.Book;
import com.sri.sbeans.Librarian;

public class LibraryTesting {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sri/cfgs/NewFile.xml");
        
        Librarian lib = ctx.getBean(Librarian.class);
        lib.manage();
	}

}

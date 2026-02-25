package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {

	private String authId;
	private String name;
	
	public Author(String authId,String name) {
		this.authId=authId;
		this.name=name;
	}
	
	public String display() {
		return "author id:"+authId+", author name:"+name+"";
	}
}

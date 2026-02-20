package com.nt.sbeans;

public class B {

	private A a;
	
	public B() {
		
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "from B";
	}
	
}

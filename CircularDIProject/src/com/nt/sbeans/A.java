package com.nt.sbeans;

public class A {
   private B b;
   
   public A() {
	   
   }

public void setB(B b) {
	this.b = b;
}

@Override
public String toString() {
	return "from A";
}
   
}

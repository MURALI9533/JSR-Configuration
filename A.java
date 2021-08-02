package com.jsrconfig;

import javax.inject.Inject;

public class A {
	@Inject
	private B b;
	
	public B getB() {
		return b;
	}
	@Inject
	public void setB(B b) {
		this.b= b;
		System.out.println("setB()");
	}
	public A() {
		System.out.println("default constructor of A");
	}
	@Inject
	public A(B b) {
		this.b=b;
		System.out.println("Arrgument constructor");
	}
	@Inject
	public void fun(B b) {
		System.out.println("inside arbitary  fun() method of A");
		this.b=b;
	}

}

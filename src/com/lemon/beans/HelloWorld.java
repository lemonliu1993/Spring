package com.lemon.beans;

public class HelloWorld {

	private String name;

	public void setName(String name) {
		System.out.println("Setters");
		this.name = name;
	}
	
	public void hello(){
		System.out.println("hello:"+name);
	}
	
	public HelloWorld() {
		System.out.println("Constructor");
	}
}

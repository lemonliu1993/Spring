package com.lemon.beans.circle;
/**
*@author created by liuyumeng
*@date 2018年9月2日 --- 下午9:34:16
*/
public class Car {

	public Car() {
		System.out.println("Car's Constructor...");
	}
	
	private String brand;

	public void setBrand(String brand) {
		System.out.println("setBrand...");
		this.brand = brand;
	}
	
	public void init(){
		System.out.println("init...");
	}
	
	public void destroy(){
		System.out.println("destroy...");
	}
}



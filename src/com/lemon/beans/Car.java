package com.lemon.beans;
/**
*@author created by liuyumeng
*@date 2018年8月28日 --- 上午8:21:45
*/
public class Car {

	private String brand;
	
	private String corp;
	
	private double price;
	
	private int maxSpeed;

	public Car(String brand, String corp, double price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	

	public Car(String brand, String corp, int maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}



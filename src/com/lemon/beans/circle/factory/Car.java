package com.lemon.beans.circle.factory;
/**
*@author created by liuyumeng
*@date 2018年9月2日 --- 下午9:34:16
*/
public class Car {

	public Car() {
		System.out.println("Car's Constructor...");
	}
	
	private String brand;
	
	private double price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
	 
	
}



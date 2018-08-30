package com.lemon.beans.collections;

import java.util.List;

import com.lemon.beans.Car;

/**
*@author created by liuyumeng
*@date 2018年8月28日 --- 下午10:11:29
*/
public class Person {

	private String name;
	
	private int age;
	
	private List<Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + cars + "]";
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	
	
}



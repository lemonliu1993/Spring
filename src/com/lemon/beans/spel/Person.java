package com.lemon.beans.spel;
/**
*@author created by liuyumeng
*@date 2018年8月30日 --- 下午10:09:14
*/
public class Person {

	private String name;
	
	private Address address;
	
	private Car car;
	
	//引用address bean的city属性
	private String city;
	
	//根据car的price确定info：car的price>=300000:金领
	//否则：白领
	private String info;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car + ", city=" + city + ", info=" + info
				+ "]";
	}

	
	
	
}



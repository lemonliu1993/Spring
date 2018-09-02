package com.lemon.beans.spel;
/**
*@author created by liuyumeng
*@date 2018年8月30日 --- 下午10:09:55
*/
public class Address {

	private String city;
	private String street;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	
	
}



package com.lemon.beans.circle.factory;

import java.util.HashMap;
import java.util.Map;

/**
*@author created by liuyumeng
*@date 2018年9月4日 --- 上午8:18:47
*静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
*/
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<>();
	
	static{
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford",400000));
	}
	
	//静态工厂方法
	public static Car getCar(String name){
		return cars.get(name);
	}
}



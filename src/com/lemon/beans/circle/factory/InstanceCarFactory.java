package com.lemon.beans.circle.factory;

import java.util.HashMap;
import java.util.Map;

/**
*@author created by liuyumeng
*@date 2018年9月4日 --- 上午8:35:21
*实例工厂方法：实例工厂的方法，即需要创建工厂本身，再调用工厂的实例方法来返回bean实例
*/
public class InstanceCarFactory {

	private Map<String,Car> cars=null;
	
	public InstanceCarFactory() {
		cars=new HashMap<>();
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford",400000));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
}



package com.lemon.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
*@author created by liuyumeng
*@date 2018年9月4日 --- 下午9:43:00
*自定义的FactoryBean需要实现FactoryBean接口
*/
public class CarFactoryBean implements FactoryBean<Car>{
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//返回beande对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand,5000000);
	}

	/**
	 * 返回的bean的类型
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	

}



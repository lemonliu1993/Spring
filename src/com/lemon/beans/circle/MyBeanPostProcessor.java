package com.lemon.beans.circle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
*@author created by liuyumeng
*@date 2018年9月3日 --- 下午10:26:35
*/

//beanPostProcessor是处理所有bean的，一般要进行过滤
public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization: "+bean+", "+beanName);
		
		if("car".equals(beanName)){
			//...
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization: "+bean+", "+beanName);
		Car car = new Car();
		car.setBrand("Ford");
		return car;
	}

}



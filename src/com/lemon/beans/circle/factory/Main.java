package com.lemon.beans.circle.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author created by liuyumeng
 * @date 2018年9月2日 --- 下午9:36:56
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car= (Car) ctx.getBean("car1");
		System.out.println(car);
		
		Car car2= (Car) ctx.getBean("car2");
		System.out.println(car2);
	}
}

package com.lemon.beans.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author created by liuyumeng
 * @date 2018年9月2日 --- 下午9:36:56
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-circle.xml");
		Car car= (Car) ctx.getBean("car");
		System.out.println(car);
		
		//关闭IOC容器
		ctx.close();
	}
}

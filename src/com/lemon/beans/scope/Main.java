package com.lemon.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lemon.beans.autowire.Address;
import com.lemon.beans.autowire.Car;
import com.lemon.beans.autowire.Person;

/**
 * @author created by liuyumeng
 * @date 2018年8月30日 --- 下午10:14:10
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car = (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car");
		System.out.println(car ==car2);
	}
}

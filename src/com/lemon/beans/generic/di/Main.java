package com.lemon.beans.generic.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lemon.beans.factorybean.Car;

/**
*@author created by liuyumeng
*@date 2018年9月7日 --- 上午7:22:24
*/
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
		
	}
}



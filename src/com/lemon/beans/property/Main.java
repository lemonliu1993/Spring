package com.lemon.beans.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lemon.beans.autowire.Address;
import com.lemon.beans.autowire.Car;
import com.lemon.beans.autowire.Person;
import com.lemon.beans.collections.DataSource;

/**
 * @author created by liuyumeng
 * @date 2018年8月30日 --- 下午10:14:10
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
	}
}

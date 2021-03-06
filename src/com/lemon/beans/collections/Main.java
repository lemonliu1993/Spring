package com.lemon.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author created by liuyumeng
 * @date 2018年8月30日 --- 上午7:49:09
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) ctx.getBean("person3");
		System.out.println(person);
		
		NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
		System.out.println(newPerson);
		
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource);
		
		Person person4 = (Person) ctx.getBean("person4");
		System.out.println(person4);
		
		Person person5 = (Person) ctx.getBean("person5");
		System.out.println(person5);

	}
}

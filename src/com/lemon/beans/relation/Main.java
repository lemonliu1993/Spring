package com.lemon.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lemon.beans.autowire.Address;
import com.lemon.beans.autowire.Person;

/**
 * @author created by liuyumeng
 * @date 2018年8月30日 --- 下午10:14:10
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		
//		Address address = (Address) ctx.getBean("address");
		
//		System.out.println(address);
		
		Address address = (Address) ctx.getBean("address2");
		System.out.println(address);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}

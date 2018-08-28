package com.lemon.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 创建一个对象
		// HelloWorld helloWorld=new HelloWorld();
		// 为name属性赋值
		// helloWorld.setName("lemon");
		// 调用方法
		// helloWorld.hello();

		// 1.创建spring的ioc容器对象
		// 传入配置的名字
		// ApplicationContext代表一个IOC容器
		//ClassPathXmlApplicationContext：是ApplicationContext接口的实现类。该实现类从类路径下来加载配置文件。
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.从ioc容器中获取bean实例
		// 利用id定位到IOC容器中到bean
		// HelloWorld helloWorld2=(HelloWorld) ctx.getBean("helloWorld");
		// 利用类型返回IOC容器中的Bean，但要求容器中必须只有一个该类型的bean
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		// 3.调用hello方法
		// helloWorld2.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car);


	}
}

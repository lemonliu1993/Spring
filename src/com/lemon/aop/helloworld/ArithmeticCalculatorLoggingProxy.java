package com.lemon.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
*@author created by liuyumeng
*@date 2018年9月10日 --- 上午8:17:45
*/
public class ArithmeticCalculatorLoggingProxy {

	//要代理的对象
	private ArithmeticCalculator target;
	
	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
		this.target=target;
	}
	
	public ArithmeticCalculator getLoggingProxy(){
		ArithmeticCalculator proxy = null;
		
		//代理对象由哪一个类加载器负责加载
		ClassLoader loader = target.getClass().getClassLoader();
		//代理对象的类型，即其中有哪些方法
		Class[] interfaces = new Class[]{ArithmeticCalculator.class};
		//当调用代理对象其中当方法时，该执行的代码
		InvocationHandler h =new InvocationHandler() {
			/**
			 * proxy:正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象
			 * method:正在呗调用的方法
			 * args:日澳用方法时，传入的参数
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodName = method.getName();
				//日志
				System.out.println("The method "+methodName+ " begins with "+ Arrays.asList(args));
				//执行方法
				Object result = method.invoke(target, args);
				//日志
				System.out.println("The method "+methodName+"ends with "+ result);
				return 0;
			}
		};
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		
		return proxy;
	}
}



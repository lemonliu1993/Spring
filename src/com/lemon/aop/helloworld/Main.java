package com.lemon.aop.helloworld;

/**
 * @author created by liuyumeng
 * @date 2018年9月9日 --- 上午9:42:27
 */
public class Main {
	public static void main(String[] args) {
//		ArithmeticCalculator arithmeticCalculator=new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator target =new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator proxy =new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int result = proxy.add(1, 2);
		System.out.println("--->"+result);
		result = proxy.div(4, 2);
		System.out.println("--->"+result);
	}
}

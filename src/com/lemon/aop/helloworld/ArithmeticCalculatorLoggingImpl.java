package com.lemon.aop.helloworld;
/**
*@author created by liuyumeng
*@date 2018年9月8日 --- 上午8:42:03
*/
public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator{

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

}



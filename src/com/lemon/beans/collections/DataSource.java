package com.lemon.beans.collections;

import java.util.Properties;

/**
*@author created by liuyumeng
*@date 2018年8月30日 --- 上午8:06:01
*/
public class DataSource {

	private Properties porperties;

	public Properties getPorperties() {
		return porperties;
	}

	public void setPorperties(Properties porperties) {
		this.porperties = porperties;
	}

	@Override
	public String toString() {
		return "DataSource [porperties=" + porperties + "]";
	}
	
	
}



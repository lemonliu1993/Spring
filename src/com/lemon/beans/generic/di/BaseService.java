package com.lemon.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*@author created by liuyumeng
*@date 2018年9月7日 --- 上午7:18:33
*/

public class BaseService<T> {

	
	@Autowired
	protected BaseRepository<T> repository;
	
	public void add(){
		System.out.println("add...");
		System.out.println(repository);
	}
}



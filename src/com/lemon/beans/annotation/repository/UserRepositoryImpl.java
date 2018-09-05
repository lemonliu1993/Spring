package com.lemon.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
*@author created by liuyumeng
*@date 2018年9月5日 --- 下午9:27:43
*/

//模拟持久化层
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{

	@Override
	public void save() {
		System.out.println("UserRepository save...");
		
	}

}



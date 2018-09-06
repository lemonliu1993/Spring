package com.lemon.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lemon.beans.annotation.repository.UserRepository;

/**
*@author created by liuyumeng
*@date 2018年9月5日 --- 下午9:28:30
*/

@Service
public class UserService {

	
	private UserRepository userRepository;
	
	
	@Autowired
	public void setUserRepository(@Qualifier("userJdbcRepository") UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	public void add(){
		System.out.println("UserService add");
		userRepository.save();
	}
}



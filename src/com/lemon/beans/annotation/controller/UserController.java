package com.lemon.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lemon.beans.annotation.service.UserService;

/**
*@author created by liuyumeng
*@date 2018年9月5日 --- 下午9:29:22
*/

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	public void execute(){
		System.out.println("UserController execute...");
		userService.add();
	}
}



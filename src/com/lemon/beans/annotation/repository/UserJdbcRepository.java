package com.lemon.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @author created by liuyumeng
 * @date 2018年9月6日 --- 下午10:41:07
 */

@Repository
public class UserJdbcRepository implements UserRepository {
	@Override
	public void save() {
		System.out.println("UserJdbcRepository save");

	}

}

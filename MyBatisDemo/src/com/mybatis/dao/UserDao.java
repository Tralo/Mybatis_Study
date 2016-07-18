package com.mybatis.dao;

import com.mybatis.po.User;

public interface UserDao {

	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserById(int id) throws Exception;
	
}

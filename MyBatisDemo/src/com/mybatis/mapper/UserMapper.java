package com.mybatis.mapper;

import java.util.List;

import com.mybatis.po.User;

public interface UserMapper {

	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserById(int id) throws Exception;
	
	/**
	 * 根据用户名模糊查询用户信息
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserByName(String name) throws Exception;
	
	/**
	 * 添加用户信息
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(User user) throws Exception;
	
	/**
	 * 删除用户信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteUser(int id) throws Exception;
	
	/**
	 * 更新用户信息
	 * @throws Exception
	 */
	public void updateUser(User user) throws Exception;
	
	
}

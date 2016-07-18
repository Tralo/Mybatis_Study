package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.po.User;

public class UserDaoImpl implements UserDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		sqlSession.close();
		return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> users = sqlSession.selectList("test.findUserByName", name);
		sqlSession.close();
		return users;
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("test.insertUser", user);
		sqlSession.commit();
		sqlSession.close();
		
	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("test.deleteUser", id);
		sqlSession.commit();
		sqlSession.close();
		
	}

	@Override
	public void updateUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("test.updateUser", user);
		sqlSession.commit();
		sqlSession.close();
		
	}

	

}

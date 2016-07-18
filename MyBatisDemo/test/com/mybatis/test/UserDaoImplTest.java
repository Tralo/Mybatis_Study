package com.mybatis.test;

import static org.junit.Assert.fail;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.UserDao;
import com.mybatis.dao.UserDaoImpl;
import com.mybatis.po.User;

public class UserDaoImplTest {

    private SqlSessionFactory sqlSessionFactory;
	 @Before
	    public void setUp() throws Exception {
	        //创建sqlSessionFactory
	        String resource = "SqlMapConfig.xml"; //mybatis配置文件

	        //得到配置文件的流
	        InputStream inputStream = Resources.getResourceAsStream(resource);

	        //创建会话工厂SqlSessionFactory,要传入mybaits的配置文件的流
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	    }
	
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		System.out.println(userDao.findUserById(1));
	}

	@Test
	public void testFindUserByName() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		System.out.println(userDao.findUserByName("1"));
	}

	@Test
	public void testInsertUser() throws Exception {
		User user = new User("zz",new Date(),"f","demaxiya"); 
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userDao.insertUser(user);
	}

	@Test
	public void testDeleteUser() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userDao.deleteUser(5);
	}

	@Test
	public void testUpdateUser() throws Exception {
	
		User user = new User("huangzi",new Date(),"f","demaxiya"); 
    	user.setId(4);
    	UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userDao.updateUser(user);
	}

}

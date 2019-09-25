package com.gaoxing.jdbc.domain.test;

import java.util.List;

import org.junit.Test;

import com.gaoxing.jdbc.dao.IUserDao;
import com.gaoxing.jdbc.dao.impl.UserDaoImpl;
import com.gaoxing.jdbc.domain.User;

public class UserTest {

	@Test
	public void test1() {
		User u1 = new User();
		u1.setName("ะกวเม๚");
		u1.setMoney(10000);
		IUserDao userDaoImpl = new UserDaoImpl();
		userDaoImpl.save(u1);
	}
	
	@Test
	public void test2() {
		IUserDao userDaoImpl = new UserDaoImpl();
		System.out.println(userDaoImpl.get("zs"));
		
	}
	
	@Test
	public void test3() {
		IUserDao userDaoImpl = new UserDaoImpl();
		List<User> all = userDaoImpl.getAll();
		System.out.println(all);
	}

}

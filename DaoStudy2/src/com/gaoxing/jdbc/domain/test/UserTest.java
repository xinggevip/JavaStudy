package com.gaoxing.jdbc.domain.test;

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

}

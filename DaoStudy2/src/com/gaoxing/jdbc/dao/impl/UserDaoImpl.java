package com.gaoxing.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gaoxing.jdbc.dao.IUserDao;
import com.gaoxing.jdbc.domain.User;
import com.gaoxing.jdbc.util.CRUDtemplate;
import com.gaoxing.jdbc.util.JdbcUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public void save(User u) {
		String sql = "insert into user (name,money) values(?,?)";
		CRUDtemplate.executeUpdate(sql, u.getName(),u.getMoney());
	}

}

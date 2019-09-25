package com.gaoxing.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaoxing.jdbc.dao.IUserDao;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.domain.User;
import com.gaoxing.jdbc.handler.IResultSetHandler;
import com.gaoxing.jdbc.util.CRUDtemplate;
import com.gaoxing.jdbc.util.JdbcUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public void save(User u) {
		String sql = "insert into user (name,money) values(?,?)";
		CRUDtemplate.executeUpdate(sql, u.getName(),u.getMoney());
	}

	@Override
	public User get(String name) {
		String sql = "select * from user where name = ?";
		List<User> list = CRUDtemplate.executeQuery(sql, new UserResultSetHandImp(),name);
		return list.size() == 1 ? list.get(0) : null;
	}
	
	public List<User> getAll() {
		String sql = "select * from user";
		return CRUDtemplate.executeQuery(sql, new UserResultSetHandImp());
	}
	
	

}

class UserResultSetHandImp implements IResultSetHandler{

	@Override
	public List handle(ResultSet res) throws Exception {
		List<User> list = new ArrayList<>();
		while (res.next()) {
			User u = new User();
			u.setName(res.getString("name"));
			u.setMoney(res.getInt("money"));
			list.add(u);
		}
		return list;
	}
	
}

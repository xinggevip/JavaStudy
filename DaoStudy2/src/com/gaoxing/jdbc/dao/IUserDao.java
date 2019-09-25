package com.gaoxing.jdbc.dao;

import java.util.List;

import com.gaoxing.jdbc.domain.User;

public interface IUserDao {
	void save(User u);
	User get(String name);
	List<User> getAll();
}

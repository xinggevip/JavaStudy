package com.xing.dao;

public interface PersonDao {
	boolean signin(String username,String pwd);
	int singup();
	void queryAll();
	
}

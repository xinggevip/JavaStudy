package com.gaoxing.jdbc.domain.test;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.gaoxing.jdbc.util.JdbcUtil;

public class LoginTest {
	
	@Test
	public void testLogin() {
		System.out.println(login("' or 1=1 or'", "1234"));
	}
	
	public String login(String name,String pwd) {
		// 1.获取连接对象
		// 2.执行sql
		// 3.判断
		Connection conn = JdbcUtil.getConn();
		try {
			Statement stt = conn.createStatement();
			String sql = "select * from user where name ='"+name+"'and pwd = '"+pwd+"'";
			System.out.println(sql);
			ResultSet res = stt.executeQuery(sql);
			if (res.next()) {
				return "登录成功！";
			}else {
				return "登陆失败！";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

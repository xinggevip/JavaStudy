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
		// 1.��ȡ���Ӷ���
		// 2.ִ��sql
		// 3.�ж�
		Connection conn = JdbcUtil.getConn();
		try {
			Statement stt = conn.createStatement();
			String sql = "select * from user where name ='"+name+"'and pwd = '"+pwd+"'";
			System.out.println(sql);
			ResultSet res = stt.executeQuery(sql);
			if (res.next()) {
				return "��¼�ɹ���";
			}else {
				return "��½ʧ�ܣ�";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

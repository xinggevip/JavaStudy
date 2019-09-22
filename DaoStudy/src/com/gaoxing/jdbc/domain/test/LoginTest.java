package com.gaoxing.jdbc.domain.test;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.jdbc.JDBC4PreparedStatement;

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
			
			String sql = "select * from user where name = ? and pwd = ?";
			PreparedStatement stt = conn.prepareStatement(sql);
			stt.setString(1, name);
			stt.setString(2,pwd);
			String asSql = ((JDBC4PreparedStatement)stt).asSql();
			System.out.println(asSql); // select * from user where name = '\' or 1=1 or\'' and pwd = '1234'
			ResultSet res = stt.executeQuery();
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

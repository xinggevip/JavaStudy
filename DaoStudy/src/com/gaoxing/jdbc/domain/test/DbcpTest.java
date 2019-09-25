package com.gaoxing.jdbc.domain.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

import com.gaoxing.jdbc.util.JdbcUtil;

public class DbcpTest {
	public static void test1() throws Exception {
		String url = "jdbc:mysql://localhost:3306/daotest?rewriteBatchedStatements=true";
		String username = "root";
		String password = "root";
		String driverClassName = "com.mysql.jdbc.Driver";
		
		
		// �������ӳ�
		BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverClassName);//com.mysql.jdbc.Driver
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setUrl(url);
        // �����ӳػ�ȡconnection����
        Connection conn = ds.getConnection();
        String sql = "select * from user";
        Statement stt = conn.createStatement();
        ResultSet res = stt.executeQuery(sql);
        while(res.next()) {
        	String name = res.getString("name");
        	double money = res.getDouble("money");
        	System.out.println(name + "=====" + money);
        }
        
        JdbcUtil.clossAll(res, stt, conn);

	}
	
	// ��ȡ�����ļ�
	public static void test2() {
		// ��ȡ�����ļ�
		Properties p = new Properties();
		
		// ��ȡ�ļ�
		try {
			FileInputStream in = new FileInputStream("resource/db.properties");
			p.load(in);
			String url = p.getProperty("url");
			String user = p.getProperty("username");
			String password = p.getProperty("password");
			String driveName = p.getProperty("driverClassName");
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			System.out.println(driveName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		// Dbcp���ӳ�ʹ��
		test1();
		// ��ȡ�����ļ�
		test2();
		

	}

}

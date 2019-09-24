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
		String url = "jdbc:mysql:///daotest?rewriteBatchedStatements=true";
		String user = "root";
		String password = "root";
		String driveName = "com.mysql.jdbc.Driver";
		
		
		// 配置连接池
		BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driveName);
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setUrl(url);
        // 从连接池获取connection对象
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
	
	// 读取配置文件
	public static void test2() {
		// 读取配置文件
		Properties p = new Properties();
		
		// 读取文件
		try {
			FileInputStream in = new FileInputStream("resource/db.properties");
			p.load(in);
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			String driveName = p.getProperty("driveName");
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
		// Dbcp连接池使用
		test1();
		// 读取配置文件
		test2();
		

	}

}

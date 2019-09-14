package com.gaoxing.sms.util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

public class ConnectionUtil {

	// 配置数据库用户名
	private static final String user = "root";
	// 配置数据库密码
	private static final String password = "root";
	// 数据库地址
	private static final String url = "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true";
	// 数据库连接对象
	private static Connection conn;

	// 初始化驱动，只初始化一次，放到静态代码块
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 获取连接对象
	public static Connection getConnection() {
		try {
			conn = (Connection) DriverManager.getConnection(url, user, password);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	// 释放子资源
	public static void closeAll(ResultSet res, Statement stt, Connection conn) {
		// 如果对象不为空，则释放
		try {
			if (res != null) {
				res.close();
			}
			if (stt != null) {
				stt.close();
			}
			if (conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

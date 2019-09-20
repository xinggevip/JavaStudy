package com.xing.smsuitl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取数据库连接
	 * @return 连接对象，如果有异常返回null
	 */
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql:///empt?useSSL=false", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 释放资源
	 * @param rs ResultSet对象
	 * @param st Statement对象
	 * @param conn Connection对象
	 */
	public static void closeAll(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}

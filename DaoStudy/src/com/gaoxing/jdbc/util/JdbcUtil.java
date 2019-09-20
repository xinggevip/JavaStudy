package com.gaoxing.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static String url = "jdbc:mysql:///daostudy?useSSL=false";
	static String user = "root";
	static String password = "root";

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void clossAll(Connection conn, Statement stt, ResultSet res) {

		try {
			if (conn != null) {
				conn.close();
			}
			if (stt != null) {
				stt.close();
			}
			if (res != null) {
				res.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

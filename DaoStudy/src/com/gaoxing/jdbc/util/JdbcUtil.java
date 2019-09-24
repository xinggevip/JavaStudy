package com.gaoxing.jdbc.util;

import java.security.spec.DSAGenParameterSpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public class JdbcUtil {
//	public static String url = "jdbc:mysql:///daotest?useSSL=false";
	public static String url = "jdbc:mysql:///daotest?rewriteBatchedStatements=true";
	public static String user = "root";
	public static String password = "root";
	public static String driveName = "com.mysql.jdbc.Driver";
	public static BasicDataSource ds = null;
	static {
		// ≈‰÷√¡¨Ω”≥ÿ
		ds = new BasicDataSource();
        ds.setDriverClassName(driveName);
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setUrl(url);
	}

	public static Connection getConn() {
		try {
			return ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void clossAll( ResultSet res, Statement stt,Connection conn) {

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
	
	
	public static void clossAll(Statement stt,Connection conn) {

		try {
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

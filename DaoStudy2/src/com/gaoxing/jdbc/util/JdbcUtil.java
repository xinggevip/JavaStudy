package com.gaoxing.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.spec.DSAGenParameterSpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;


import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JdbcUtil {

	public static DataSource ds = null;
	static {
		// �������ӳ�
		try {
			Properties p = new Properties();
			FileInputStream in = new FileInputStream("resource/db.properties");
			p.load(in);
//			ds = BasicDataSourceFactory.createDataSource(p);
			ds = DruidDataSourceFactory.createDataSource(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

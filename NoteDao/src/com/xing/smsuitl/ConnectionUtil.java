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
	 * ��ȡ���ݿ�����
	 * @return ���Ӷ���������쳣����null
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
	 * �ͷ���Դ
	 * @param rs ResultSet����
	 * @param st Statement����
	 * @param conn Connection����
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

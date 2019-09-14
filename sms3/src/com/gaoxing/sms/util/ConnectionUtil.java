package com.gaoxing.sms.util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

public class ConnectionUtil {

	// �������ݿ��û���
	private static final String user = "root";
	// �������ݿ�����
	private static final String password = "root";
	// ���ݿ��ַ
	private static final String url = "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true";
	// ���ݿ����Ӷ���
	private static Connection conn;

	// ��ʼ��������ֻ��ʼ��һ�Σ��ŵ���̬�����
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ��ȡ���Ӷ���
	public static Connection getConnection() {
		try {
			conn = (Connection) DriverManager.getConnection(url, user, password);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	// �ͷ�����Դ
	public static void closeAll(ResultSet res, Statement stt, Connection conn) {
		// �������Ϊ�գ����ͷ�
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

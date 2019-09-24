package com.gaoxing.jdbc.domain.test;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.jdbc.Connection;

public class ProcedureTest {
	
	// ���ô洢����
	public static void test1(){
		// 1.�������ݿ�
		Connection conn = (Connection) JdbcUtil.getConn();
		// 2.���ô洢����
		try {
			CallableStatement cs = conn.prepareCall("{ call getStu(?) }");
			// 3.���ò���
			cs.setString(1, "ls");
			// 4.ִ�д洢����
			ResultSet res = cs.executeQuery();
			if (res.next()) {
				System.out.println(res.getInt("id"));
				System.out.println(res.getString("name"));
				System.out.println(res.getInt("age"));
			}
			JdbcUtil.clossAll(res, cs, conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test2(){
		// 1.�������ݿ�
		Connection conn = (Connection) JdbcUtil.getConn();
		// 2.���ô洢����
		try {
			CallableStatement cs = conn.prepareCall("{ call getName(?,?) }");
			// 3.���ò���
			// �����������
			cs.setInt(1, 1);
			// �����������
			cs.registerOutParameter(2,Types.VARCHAR);
			// 4.ִ�д洢����
			cs.execute();
			
			String res = cs.getString(2);
			System.out.println(res);
			JdbcUtil.clossAll(null, cs, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// ���ô洢����
		test1();
		// ������������洢����
		test2();
		
		

	}

}

package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.gaoxing.jdbc.util.JdbcUtil;

public class Generated {
	// �Զ���ȡ����
	public static void test1(){
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) values('hahah',99)";
		Statement stt = null;
		ResultSet res = null;
		try {
			stt = conn.createStatement();
			// ���ÿ��Ի�ȡ����
			stt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			// ��ȡ�Զ����ɵ�id
			res = stt.getGeneratedKeys();
			if (res.next()) {
				int id = res.getInt(1);
				System.out.println(id);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(res, stt, conn);
		}
	}
	
	// �Զ���ȡ����֮Preparedstatement
	public static void test2(){
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) values(?,?)";
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			// ���ÿ��Ի�ȡ����
			ps.setString(1, "Tom");
			ps.setInt(2, 55);
			ps.executeUpdate();
			// ��ȡ����
			res = ps.getGeneratedKeys();
			if (res.next()) {
				int id = res.getInt(1);
				System.out.println(id);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(res, ps, conn);
		}
	}

	public static void main(String[] args) {
		// �Զ���ȡ����֮Statement
		test1();
		// �Զ���ȡ����֮Preparedstatement
		test2();
		

	}

}

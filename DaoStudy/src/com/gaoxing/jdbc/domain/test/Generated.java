package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.gaoxing.jdbc.util.JdbcUtil;

public class Generated {
	// 自动获取主键
	public static void test1(){
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) values('hahah',99)";
		Statement stt = null;
		ResultSet res = null;
		try {
			stt = conn.createStatement();
			// 设置可以获取主键
			stt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			// 获取自动生成的id
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
	
	// 自动获取主键之Preparedstatement
	public static void test2(){
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) values(?,?)";
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			// 设置可以获取主键
			ps.setString(1, "Tom");
			ps.setInt(2, 55);
			ps.executeUpdate();
			// 获取主键
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
		// 自动获取主键之Statement
		test1();
		// 自动获取主键之Preparedstatement
		test2();
		

	}

}

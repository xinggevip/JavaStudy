package com.gaoxing.jdbc.domain.test;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.jdbc.Connection;

public class ProcedureTest {
	
	// 调用存储过程
	public static void test1(){
		// 1.连接数据库
		Connection conn = (Connection) JdbcUtil.getConn();
		// 2.调用存储过程
		try {
			CallableStatement cs = conn.prepareCall("{ call getStu(?) }");
			// 3.设置参数
			cs.setString(1, "ls");
			// 4.执行存储过程
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
		// 1.连接数据库
		Connection conn = (Connection) JdbcUtil.getConn();
		// 2.调用存储过程
		try {
			CallableStatement cs = conn.prepareCall("{ call getName(?,?) }");
			// 3.设置参数
			// 设置输入参数
			cs.setInt(1, 1);
			// 设置输出参数
			cs.registerOutParameter(2,Types.VARCHAR);
			// 4.执行存储过程
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
		// 调用存储过程
		test1();
		// 调用输出参数存储过程
		test2();
		
		

	}

}

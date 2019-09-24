package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;

import com.gaoxing.jdbc.util.JdbcUtil;

public class TransationTest {
	public static void test1() throws Exception{
		Connection conn = JdbcUtil.getConn();
		ResultSet res1 = null;
		PreparedStatement stt1 = null;
		PreparedStatement stt2 = null;
		PreparedStatement stt3 = null;
		
		try {
			
			// 先判断zs账户里有没有钱
			String sql1 = "select money from user where name = ? and money >= ?";
			stt1 = conn.prepareStatement(sql1);
			stt1.setString(1, "zs");
			stt1.setInt(2, 1000);
			res1 = stt1.executeQuery();
			if (!res1.next()) {
				System.out.println("没钱了");
				JdbcUtil.clossAll(res1, stt1, conn);
				
			}else{
				System.out.println("有钱");
				// zs有钱开始转账
				// zs少1000
				// ls加1000
				// 关闭事务自动提交
				conn.setAutoCommit(false);
				String sql2 = "update user set money = money - ? where name = ?";
				stt2 = conn.prepareStatement(sql2);
				stt2.setInt(1, 1000);
				stt2.setString(2, "zs");
				stt2.execute();
				
//				System.out.println(1 / 0);
				
				String sql3 = "update user set money = money + ? where name = ?";
				stt3 = conn.prepareStatement(sql3);
				stt3.setInt(1, 1000);
				stt3.setString(2, "ls");
				stt3.execute();
				// 提交操作
				conn.commit();
				
		
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			// 关闭资源
			JdbcUtil.clossAll(res1, stt1, conn);
			JdbcUtil.clossAll(null, stt2, conn);
			JdbcUtil.clossAll(null, stt3, conn);
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		// 事务转账
		test1();

	}

}

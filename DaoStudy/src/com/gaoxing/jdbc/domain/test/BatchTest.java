package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gaoxing.jdbc.util.JdbcUtil;

public class BatchTest {
	// 批处理
	public static void test1(){
		// 计算插入1000条数据耗时
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) values(?,?)";
		PreparedStatement ps = null;
		try {
			 ps = conn.prepareStatement(sql);
			 // 创建时间戳
			 long oldTime = System.currentTimeMillis();
			 for (int i = 0; i < 1000; i++) {
				 ps.setString(1, "gx");
				 ps.setInt(2, 18);
				 // 添加批处理
				 ps.addBatch();
			}
			 // 执行批处理
			 ps.executeBatch();
			 long newTime = System.currentTimeMillis();
			 long time = newTime - oldTime;
			 System.out.println("耗时----" + time);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// 批处理
		test1();
	}

}

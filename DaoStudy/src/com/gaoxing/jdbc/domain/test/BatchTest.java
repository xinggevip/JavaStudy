package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gaoxing.jdbc.util.JdbcUtil;

public class BatchTest {
	// ������
	public static void test1(){
		// �������1000�����ݺ�ʱ
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) values(?,?)";
		PreparedStatement ps = null;
		try {
			 ps = conn.prepareStatement(sql);
			 // ����ʱ���
			 long oldTime = System.currentTimeMillis();
			 for (int i = 0; i < 1000; i++) {
				 ps.setString(1, "gx");
				 ps.setInt(2, 18);
				 // ���������
				 ps.addBatch();
			}
			 // ִ��������
			 ps.executeBatch();
			 long newTime = System.currentTimeMillis();
			 long time = newTime - oldTime;
			 System.out.println("��ʱ----" + time);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// ������
		test1();
	}

}

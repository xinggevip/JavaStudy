package com.gaoxing.jdbc.domain.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gaoxing.jdbc.util.JdbcUtil;

public class BlobTest {
	// 上传图片
	public static void test1(){
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (img) values(?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			FileInputStream in = new FileInputStream("D:/picture01.jpg");
			ps.setBlob(1, in);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(ps, conn);
		}
	}

	public static void main(String[] args) {
		// 上传图片
		test1();

	}

}

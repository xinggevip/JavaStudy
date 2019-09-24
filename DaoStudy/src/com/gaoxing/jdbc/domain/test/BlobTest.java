package com.gaoxing.jdbc.domain.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gaoxing.jdbc.util.JdbcUtil;

public class BlobTest {
	// �ϴ�ͼƬ
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
	// �����ݿ�����ͼƬ
	public static void test2(){
		Connection conn = JdbcUtil.getConn();
		String sql = "select * from student where id = ?";
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			res = ps.executeQuery();
			if (res.next()) {
				// ��ȡ���ݿ�ͼƬ��������
				Blob blob = res.getBlob("img");
				InputStream in = blob.getBinaryStream();
				Files.copy(in, Paths.get("D:/mypicture.jpg"));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(res, ps, conn);
		}
	}

	public static void main(String[] args) {
		// �ϴ�ͼƬ
//		test1();
		test2();

	}

}

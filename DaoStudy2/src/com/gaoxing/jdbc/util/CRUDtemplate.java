package com.gaoxing.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaoxing.jdbc.domain.Student;

public class CRUDtemplate {
	public static int executeUpdate(String sql, Object... params) {
		Connection conn = JdbcUtil.getConn();
		PreparedStatement stt = null;
		try {
			stt = conn.prepareStatement(sql);
			// ��������
			for (int i = 0; i < params.length; i++) {
				stt.setObject(i + 1, params[i]);
			}

			return stt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.clossAll(stt, conn);
		}
		return 0;
	}

	public static List<Student> executeQuery(String sql, Object... params) {

		Connection conn = JdbcUtil.getConn();
		PreparedStatement stt = null;
		ResultSet res = null;
		List<Student> list = new ArrayList<Student>();
		try {
			stt = conn.prepareStatement(sql);
			// ��������
			for (int i = 0; i < params.length; i++) {
				stt.setObject(i + 1, params[i]);
			}
			res = stt.executeQuery();
			while (res.next()) {
				Student stu = new Student();
				stu.setId(res.getInt("id"));
				stu.setName(res.getString("name"));
				stu.setAge(res.getInt("age"));
				list.add(stu);
			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.clossAll(res, stt, conn);
		}

		return list;
	}

}

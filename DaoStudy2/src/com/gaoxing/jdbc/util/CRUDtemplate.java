package com.gaoxing.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.handler.IResultSetHandler;

public class CRUDtemplate {
	public static int executeUpdate(String sql, Object... params) {
		Connection conn = JdbcUtil.getConn();
		PreparedStatement stt = null;
		try {
			stt = conn.prepareStatement(sql);
			// 遍历参数
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

	public static <T>T executeQuery(String sql, IResultSetHandler<T> rh, Object... params) {

		Connection conn = JdbcUtil.getConn();
		PreparedStatement stt = null;
		ResultSet res = null;
		try {
			stt = conn.prepareStatement(sql);
			// 遍历参数
			for (int i = 0; i < params.length; i++) {
				stt.setObject(i + 1, params[i]);
			}
			res = stt.executeQuery();
			
			return rh.handle(res);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.clossAll(res, stt, conn);
		}

		return null;
	}

}

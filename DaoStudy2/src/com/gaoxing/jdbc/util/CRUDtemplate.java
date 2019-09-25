package com.gaoxing.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDtemplate {
	public static int executeUpdate(String sql,Object...params) {
		Connection conn = JdbcUtil.getConn();
		PreparedStatement stt = null;
		try {
			stt = conn.prepareStatement(sql);
			// ��������
			for(int i = 0;i < params.length;i++) {
				stt.setObject(i+1, params[i]);
			}
			
			return stt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(stt, conn);
		}
		return 0;
	}

}

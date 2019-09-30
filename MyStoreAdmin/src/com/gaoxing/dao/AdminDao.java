package com.gaoxing.dao;


import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.gaoxing.domain.Admin;
import com.gaoxing.jdbc.util.JdbcUtil;

public class AdminDao {

	public Admin checkAdmin(String username, String password) throws SQLException {
		
		// �����ݿ��в�ѯ
		// 1.�������ݿ�
		QueryRunner qr = JdbcUtil.getQueryRunner();
		// 2.��ѯ
		String sql = "select * from admin where username=? and password=?";
		Admin admin = null;
		admin = qr.query(sql, new BeanHandler<Admin>(Admin.class),username,password);
		// ���ز�ѯ���
		return admin;
	}

}

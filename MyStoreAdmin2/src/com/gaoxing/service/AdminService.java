package com.gaoxing.service;

import java.sql.SQLException;

import com.gaoxing.dao.AdminDao;
import com.gaoxing.domain.Admin;

public class AdminService {

	public Admin login(String username, String password) throws Exception {
		// ����dao�㵽���ݿ��в�ѯ
		AdminDao adminDao = new AdminDao();
		Admin admin = adminDao.checkAdmin(username,password);
		if (admin != null) {
			return admin;
		}else {
			throw new Exception("�û������������");
		}
		
	}

}

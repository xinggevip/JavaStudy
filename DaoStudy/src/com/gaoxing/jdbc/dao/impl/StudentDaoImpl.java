package com.gaoxing.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.gaoxing.jdbc.dao.IStudentDao;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.jdbc.PreparedStatement;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public void save(Student stu) {
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (id,name,age) value(?,?,?)";
		PreparedStatement stt;
		try {
			stt = (PreparedStatement) conn.prepareStatement(sql);
			stt.setInt(1, stu.getId());
			stt.setString(2, stu.getName());
			stt.setInt(3, stu.getAge());
			stt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delStu(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}

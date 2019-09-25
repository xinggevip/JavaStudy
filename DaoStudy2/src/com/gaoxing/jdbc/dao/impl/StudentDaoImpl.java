package com.gaoxing.jdbc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaoxing.jdbc.dao.IStudentDao;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.util.CRUDtemplate;
import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.jdbc.JDBC4PreparedStatement;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public void save(Student stu) {
		
		String sql = "insert into student (name,age) value(?,?)";
		CRUDtemplate.executeUpdate(sql, stu.getName(),stu.getAge());
		
	}
	
	
	@Override
	public void update(int id,Student stu) {
		
		String sql = "update student set name = ?,age = ? where id = ?";
		CRUDtemplate.executeUpdate(sql, stu.getName(),stu.getAge(),id);
		
	}

	@Override
	public void delete(Integer id) {
		
		String sql = "delete from student where id = ?";
		CRUDtemplate.executeUpdate(sql, id);
		
	}

	@Override
	public Student get(int id) {
		
		String sql = "select * from student where id = ?";
		List<Student> list = CRUDtemplate.executeQuery(sql, id);
		return list.size() == 1 ? list.get(0) : null;
	}

	@Override
	public List<Student> getAll() {
		String sql = "select * from student";
		return CRUDtemplate.executeQuery(sql);
	}


	

}

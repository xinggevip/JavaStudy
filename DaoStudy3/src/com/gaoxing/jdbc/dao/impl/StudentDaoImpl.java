package com.gaoxing.jdbc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.gaoxing.jdbc.dao.IStudentDao;
import com.gaoxing.jdbc.domain.Student;

import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.JDBC4PreparedStatement;

public class StudentDaoImpl implements IStudentDao{
	public static QueryRunner qr = null;
	static {
		qr = JdbcUtil.getQueryRunner();
	}

	@Override
	public void save(Student stu) {
		
		String sql = "insert into student (name,age) value(?,?)";
		try {
			qr.update(sql, stu.getName(),stu.getAge());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void update(int id,Student stu) {
		
		String sql = "update student set name = ?,age = ? where id = ?";
		try {
			qr.update(sql, stu.getName(),stu.getAge(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Integer id) {
		
		String sql = "delete from student where id = ?";
		try {
			qr.update(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Student get(int id) {
		
		String sql = "select * from student where id = ?";
		try {
			return qr.query(sql,new BeanHandler<Student>(Student.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getAll() {
		String sql = "select * from student";
		try {
			return qr.query(sql,new BeanListHandler<Student>(Student.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Integer getCount() {
		String sql = "select count(*) as count from student";
		try {
			int count = ((Long)qr.query(sql, new ScalarHandler(1))).intValue();
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public void test() {
		String sql = "select * from student";
		try {
			List<Map<String, Object>> maps = qr.query(sql,new MapListHandler());
			System.out.println(maps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

}


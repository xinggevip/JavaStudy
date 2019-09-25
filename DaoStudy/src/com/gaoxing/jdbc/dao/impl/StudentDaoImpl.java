package com.gaoxing.jdbc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaoxing.jdbc.dao.IStudentDao;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.jdbc.JDBC4PreparedStatement;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public void save(Student stu) {
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into student (name,age) value(?,?)";
		PreparedStatement stt = null;
		try {
			stt = conn.prepareStatement(sql);
			stt.setString(1, stu.getName());
			stt.setInt(2, stu.getAge());
			stt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(stt, conn);
		}
		
	}

	@Override
	public void update(int id,Student stu) {
		Connection conn = JdbcUtil.getConn();
		String sql = "update student set name = ?,age = ? where id = ?";
		PreparedStatement stt = null;
		try {
			stt = conn.prepareStatement(sql);
			stt.setString(1, stu.getName());
			stt.setInt(2, stu.getAge());
			stt.setInt(3, id);
			stt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(stt, conn);
		}
		
	}

	@Override
	public void delete(Integer id) {
		Connection conn = JdbcUtil.getConn();
		String sql = "delete from student where id = ?";
		PreparedStatement stt = null;
		try {
			stt = conn.prepareStatement(sql);
			stt.setInt(1, id);
			stt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(stt, conn);
		}
		
	}

	@Override
	public Student get(int id) {
		Connection conn = JdbcUtil.getConn();
		String sql = "select * from student where id = ?";
		PreparedStatement stt = null;
		ResultSet res = null;
		try {
			stt = conn.prepareStatement(sql);
			stt.setInt(1, id);
			String asSql = ((JDBC4PreparedStatement)stt).asSql();
			System.out.println(asSql);
			res = stt.executeQuery();
			if(res.next()) {
				Student stu = new Student();
				stu.setId(res.getInt("id"));
				stu.setName(res.getString("name"));
				stu.setAge(res.getInt("age"));
				return stu;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.clossAll(res, stt, conn);
		}
		return null;
	}

	@Override
	public List<Student> getAll() {
		Connection conn = JdbcUtil.getConn();
		String sql = "select * from student";
		PreparedStatement stt = null;
		ResultSet res = null;
		List<Student> list = new ArrayList<Student>();
		try {
			stt = conn.prepareStatement(sql);
			res = stt.executeQuery();
			while(res.next()) {
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
		}finally {
			JdbcUtil.clossAll(res, stt, conn);
		}
		return null;
	}


	

}

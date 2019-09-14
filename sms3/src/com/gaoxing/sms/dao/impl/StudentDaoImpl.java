package com.gaoxing.sms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.CommunicationException;

import java.sql.*;

import com.gaoxing.sms.dao.StudentDao;
import com.gaoxing.sms.module.Student;
import com.gaoxing.sms.util.ConnectionUtil;
import com.mysql.jdbc.Connection;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int saveStudent(Student stu) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement stt;
		ResultSet res;
		int rowCount;
		
		conn = ConnectionUtil.getConnection();
		try {
			stt = (PreparedStatement) conn.prepareStatement("insert into t_student values(null,?,?,?,?,?)");
			stt.setString(1, stu.getSname());
			stt.setString(2, stu.getSex());
			stt.setInt(3, stu.getAge());
			stt.setString(4, stu.getMobile());
			stt.setInt(5, stu.getClassId());
			
			rowCount = stt.executeUpdate();
			return rowCount;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Student queryBySid(int sid) {
		Connection conn;
		PreparedStatement stt;
		ResultSet res;
		
		conn = ConnectionUtil.getConnection();
		try {
			stt = conn.prepareStatement("select * from t_student where sid = ?");
			stt.setInt(1, sid);
			res = stt.executeQuery();
			Student stu = new Student();
			while(res.next()) {
				stu.setSid(res.getInt("sid"));
				stu.setSname(res.getString("name"));
				stu.setSex(res.getString("sex"));
				stu.setAge(res.getInt("age"));
				stu.setMobile(res.getString("mobile"));
				stu.setClassId(res.getInt("classId"));
			}
			// 返回学生对象
			return stu;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		// 如果出现异常则返回null
		return null;
	}

	@Override
	public int deleteStudent(int sid) {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stt;
		ResultSet res;
		int rowCount;
		try {
			stt = conn.prepareStatement("delete from t_student where sid = ?");
			stt.setInt(1, sid);
			rowCount = stt.executeUpdate();
			return rowCount;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Student> queryAll() {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stt;
		ResultSet res;
		int rowCount;
		List<Student> list = new ArrayList<Student>();
		
		try {
			stt = conn.prepareStatement("select * from t_student");
			res = stt.executeQuery();
			while(res.next()) {
				Student stu = new Student();
				stu.setSid(res.getInt("sid"));
				stu.setSname(res.getString("name"));
				stu.setSex(res.getString("sex"));
				stu.setAge(res.getInt("age"));
				stu.setMobile(res.getString("mobile"));
				stu.setClassId(res.getInt("classId"));
				list.add(stu);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void exeCuston(String sql) {
		Connection conn = ConnectionUtil.getConnection();
		Statement stt;
		try {
			stt = conn.createStatement();
			stt.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

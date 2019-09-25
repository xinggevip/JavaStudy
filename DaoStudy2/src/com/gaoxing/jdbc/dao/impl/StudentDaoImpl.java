package com.gaoxing.jdbc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaoxing.jdbc.dao.IStudentDao;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.handler.IResultSetHandler;
import com.gaoxing.jdbc.util.CRUDtemplate;
import com.gaoxing.jdbc.util.JdbcUtil;
import com.mysql.fabric.xmlrpc.base.Array;
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
		IResultSetHandler<List<Student>> rh = new StuResultSetHandImp();
		List<Student> list = CRUDtemplate.executeQuery(sql, rh, id);
		return list.size() == 1 ? list.get(0) : null;
	}

	@Override
	public List<Student> getAll() {
		String sql = "select * from student";
		IResultSetHandler<List<Student>> rh = new StuResultSetHandImp();
		return CRUDtemplate.executeQuery(sql, rh);
	}


	@Override
	public Integer getCount() {
		String sql = "select count(*) as count from student";
		return CRUDtemplate.executeQuery(sql, new StuCountResultSetHandImp());
	}


	

}

class StuResultSetHandImp implements IResultSetHandler<List<Student>>{
	List<Student> list = new ArrayList<>();
	@Override
	public List<Student> handle(ResultSet res) throws Exception {
		while (res.next()) {
			Student stu = new Student();
			stu.setId(res.getInt("id"));
			stu.setName(res.getString("name"));
			stu.setAge(res.getInt("age"));
			list.add(stu);
		}
		return list;
	}
	
}

class StuCountResultSetHandImp implements IResultSetHandler<Integer>{

	@Override
	public Integer handle(ResultSet res) throws Exception {
		if (res.next()) {
			return res.getInt("count");
		}
		return 0;
		
		
	}
	
}


package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Test;

import com.gaoxing.jdbc.dao.IStudentDao;
import com.gaoxing.jdbc.dao.impl.StudentDaoImpl;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.util.JdbcUtil;

public class StudentDaoTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("hh");
		s1.setAge(19);
		IStudentDao stuDao1 = new StudentDaoImpl();
		stuDao1.save(s1);

	}
	@Test
	public void save() {
		Student s1 = new Student();
		s1.setName("eeee");
		s1.setAge(19);
		IStudentDao stuDao1 = new StudentDaoImpl();
		stuDao1.save(s1);
	}
	@Test
	public void delete() {
		IStudentDao stuDao1 = new StudentDaoImpl();
		stuDao1.delete(2);
	}
	@Test
	public void update() {
		Student s1 = new Student();
		s1.setName("李四g");
		s1.setAge(22);
		IStudentDao studao1 = new StudentDaoImpl();
		studao1.update(1, s1);
	}
	@Test
	public void get() {
		IStudentDao studao1 = new StudentDaoImpl();
		Student s1 = studao1.get(1);
		System.out.println(s1);
	}
	@Test
	public void getAll() {
		IStudentDao studao1 = new StudentDaoImpl();
		List<Student> all = studao1.getAll();
		System.out.println(all);
	}
	
	@Test
	public void getCount() {
		IStudentDao studao1 = new StudentDaoImpl();
		System.out.println(studao1.getCount());
	}
	
	@Test
	public void test() {
		IStudentDao studao1 = new StudentDaoImpl();
		studao1.test(); // [{name=李四g, id=1, age=22}, {name=hh, id=3, age=19}, {name=ggg, id=4, age=19}]
	}

}

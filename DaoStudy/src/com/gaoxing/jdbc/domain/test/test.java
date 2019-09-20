package com.gaoxing.jdbc.domain.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gaoxing.jdbc.dao.impl.StudentDaoImpl;
import com.gaoxing.jdbc.domain.Student;
import com.gaoxing.jdbc.util.JdbcUtil;

public class test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Ïþ¶«");
		s1.setAge(19);
		StudentDaoImpl stuDao1 = new StudentDaoImpl();
		stuDao1.save(s1);

	}

}

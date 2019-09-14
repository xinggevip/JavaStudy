package com.gaoxing.sms.serverimp;

import java.util.Iterator;
import java.util.List;

import com.gaoxing.sms.dao.StudentDao;
import com.gaoxing.sms.dao.impl.StudentDaoImpl;
import com.gaoxing.sms.module.Student;
import com.gaoxing.sms.server.StudentServer;

public class StudentServerImpl implements StudentServer {
	public StudentDao sDao = new StudentDaoImpl();
	@Override
	public boolean add(Student stu) {
		if (sDao.saveStudent(stu) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Student search(int id) {
		return sDao.queryBySid(id);
	}

	@Override
	public boolean del(int id) {
		if (sDao.deleteStudent(id) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void showAll() {
		List<Student> list = sDao.queryAll();
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student);
			
		}
		

	}
	
	public void exeCustom(String sql) {
		sDao.exeCuston(sql);
	
	}

}

package com.gaoxing.jdbc.dao;

import com.gaoxing.jdbc.domain.Student;

public interface IStudentDao {
	/**
	 * ����ѧ���������ݿ���
	 * @param stu
	 */
	void save(Student stu);
	
	
	/**
	 * ����idɾ��ѧ��
	 * @param stu
	 */
	void delStu(Integer id);
	
	

}

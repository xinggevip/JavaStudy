package com.gaoxing.sms.dao;

import java.util.ArrayList;
import java.util.List;

import com.gaoxing.sms.module.Student;

public interface StudentDao {
	// ��ƶ�ѧ��������ɾ�Ĳ�Ľӿ�
	
	/**
	 * ����ѧ�������ݿ⣬���ظ��µ�����
	 * @param stu Student����
	 * @return int ��������
	 */
	int saveStudent(Student stu);
	
	/**
	 * ����sid��ѯѧ��������student����
	 * @param sid int  ѧ��id
	 * @return Student ѧ������
	 */
	Student queryBySid(int sid);
	
	/**
	 * ����sidɾ��ѧ�������ظ�������
	 * @param sid int
	 * @return int ��������
	 */
	int deleteStudent(int sid);
	
	/**
	 * ��ѯ����ѧ��,����List<Student>ѧ������
	 * @return List<Student>
	 */
	List<Student> queryAll();
	
	/**
	 * ִ���û������sql���
	 * @param sql
	 * @return
	 */
	void exeCuston(String sql);
	

}

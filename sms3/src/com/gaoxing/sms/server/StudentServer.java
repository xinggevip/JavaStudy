package com.gaoxing.sms.server;

import com.gaoxing.sms.module.Student;

public interface StudentServer {
	// ��Ʋ���ѧ������ҵ��ӿ�
	// ��Щ�����൱�����ϴ�Ĺܼң���Щ�ܼҸ����ϴ���ɵ����
	
	/**
	 * �ж�ѧ���Ƿ���ӳɹ�
	 * @param stu
	 * @return boolean
	 */
	boolean add(Student stu);
	
	/**
	 * ����id��ѧ��������Student����
	 * @param id
	 * @return Student
	 */
	Student search(int id);
	
	/**
	 * ����idɾ�����ݿ��е�
	 * @param id
	 * @return boolean
	 */
	boolean del(int id);
	
	
	/**
	 * ��ʾ����ѧ��
	 */
	void showAll();
	
	/**
	 * ִ��sql
	 * @param sql
	 * @return
	 */
	void exeCustom(String sql);
	
	
	
}

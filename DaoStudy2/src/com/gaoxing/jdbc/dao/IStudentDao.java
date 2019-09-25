package com.gaoxing.jdbc.dao;



import java.util.List;

import com.gaoxing.jdbc.domain.Student;

public interface IStudentDao {
	/**
	 * 1.����ѧ���������ݿ���
	 * @param stu
	 */
	void save(Student stu);
	
	/**
	 * 2.�޸�ѧ��ָ����Ϣ
	 * @param stu
	 */
	void update(int id,Student stu);
	
	
	/**
	 * 3.����idɾ��ѧ��
	 * @param stu
	 */
	void delete(Integer id);
	
	/**
	 * 4.����id��ȡѧ������
	 * @param id
	 * @return
	 */
	Student get(int id);
	
	/**
	 * 5.��ȡ����ѧ��
	 * @return
	 */
	List<Student> getAll();
	
	
	
	

}

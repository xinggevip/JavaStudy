package com.gaoxing.jdbc.dao;

import com.gaoxing.jdbc.domain.Student;

public interface IStudentDao {
	/**
	 * 保存学生对象到数据库中
	 * @param stu
	 */
	void save(Student stu);
	
	
	/**
	 * 根据id删除学生
	 * @param stu
	 */
	void delStu(Integer id);
	
	

}

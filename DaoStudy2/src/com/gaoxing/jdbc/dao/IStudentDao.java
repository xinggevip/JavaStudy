package com.gaoxing.jdbc.dao;



import java.util.List;

import com.gaoxing.jdbc.domain.Student;

public interface IStudentDao {
	/**
	 * 1.保存学生对象到数据库中
	 * @param stu
	 */
	void save(Student stu);
	
	/**
	 * 2.修改学生指定信息
	 * @param stu
	 */
	void update(int id,Student stu);
	
	
	/**
	 * 3.根据id删除学生
	 * @param stu
	 */
	void delete(Integer id);
	
	/**
	 * 4.根据id获取学生对象
	 * @param id
	 * @return
	 */
	Student get(int id);
	
	/**
	 * 5.获取所有学生
	 * @return
	 */
	List<Student> getAll();
	
	
	
	

}

package com.gaoxing.sms.dao;

import java.util.ArrayList;
import java.util.List;

import com.gaoxing.sms.module.Student;

public interface StudentDao {
	// 设计对学生进行增删改查的接口
	
	/**
	 * 保存学生到数据库，返回更新的行数
	 * @param stu Student对象
	 * @return int 更新行数
	 */
	int saveStudent(Student stu);
	
	/**
	 * 根据sid查询学生，返回student对象
	 * @param sid int  学生id
	 * @return Student 学生对象
	 */
	Student queryBySid(int sid);
	
	/**
	 * 根据sid删除学生，返回更新行数
	 * @param sid int
	 * @return int 更新行数
	 */
	int deleteStudent(int sid);
	
	/**
	 * 查询所有学生,返回List<Student>学生集合
	 * @return List<Student>
	 */
	List<Student> queryAll();
	
	/**
	 * 执行用户输入的sql语句
	 * @param sql
	 * @return
	 */
	void exeCuston(String sql);
	

}

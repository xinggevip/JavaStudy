package com.gaoxing.sms.server;

import com.gaoxing.sms.module.Student;

public interface StudentServer {
	// 设计操作学生对象业务接口
	// 这些玩意相当于是老大的管家，这些管家告诉老大完成的情况
	
	/**
	 * 判断学生是否添加成功
	 * @param stu
	 * @return boolean
	 */
	boolean add(Student stu);
	
	/**
	 * 根据id查学生，返回Student对象
	 * @param id
	 * @return Student
	 */
	Student search(int id);
	
	/**
	 * 根据id删除数据库中的
	 * @param id
	 * @return boolean
	 */
	boolean del(int id);
	
	
	/**
	 * 显示所有学生
	 */
	void showAll();
	
	/**
	 * 执行sql
	 * @param sql
	 * @return
	 */
	void exeCustom(String sql);
	
	
	
}

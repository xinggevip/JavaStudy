package com.gaoxing.jdbcstudent;

public interface IjdbcBle {
	// 增加学生 返回boolean
	public boolean add();
	// 删除学生返回boolean
	public boolean remove();
	// 查看学生，调用数据库查询
	public void show();
	// 更改学生信息，返回boolean
	public boolean updata();

}

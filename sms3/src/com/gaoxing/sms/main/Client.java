package com.gaoxing.sms.main;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import java.util.Scanner;

import com.gaoxing.sms.dao.StudentDao;
import com.gaoxing.sms.dao.impl.StudentDaoImpl;
import com.gaoxing.sms.module.Student;
import com.gaoxing.sms.server.StudentServer;
import com.gaoxing.sms.serverimp.StudentServerImpl;

public class Client {

	
	static void showMenu() {
		System.out.println("-------------------------");
		System.out.println("｜\t欢迎来到学生管理系统\t｜");
		System.out.println("-------------------------");
		System.out.println("｜\t按以下数字键+enter结束｜");
		System.out.println("｜\t1.添加学生\t\t｜\n｜\t2.删除学生\t\t｜\n｜\t3.查找学生\t\t｜\n｜\t4.显示所有\t\t｜\n｜\t5.自定义sql\t｜");
		System.out.println("-------------------------");
		System.out.print("请输入数字命令：");
		int num;
		StudentServer stuServer = new StudentServerImpl();
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num == 1) {
			
			Student stu = new Student();
			
			String name = null,sex = null,mobile = null;
			int age = 0,classId = 0;
			
			for(int i = 0;i < 6;i++) {
				if (i == 0) {
					System.out.print("请输入学生姓名：");
					name = sc.nextLine();
					name = sc.nextLine();
				}else if (i == 1) {
					System.out.print("请输入学生性别：");
					sex = sc.nextLine();
				}else if (i == 2) {
					System.out.print("请输入学生年龄：");
					age = sc.nextInt();
				}else if (i == 3) {
					System.out.print("请输入学生号码：");
					mobile = sc.nextLine();
					mobile = sc.nextLine();
				}else if (i == 4) {
					System.out.print("请输入学生班级id：");
					classId = sc.nextInt();
				}
			}
			
			stu.setSname(name);
			stu.setSex(sex);
			stu.setAge(age);
			stu.setMobile(mobile);
			stu.setClassId(classId);
			if (stuServer.add(stu)) {
				System.out.println("添加成功！");
			}else {
				System.out.println("添加失败！");
			}
			
			Client.showMenu();
		}else if (num == 2) {
			int sid;
			System.out.print("请输入学生的sid：");
			sid = sc.nextInt();
			
			if (stuServer.del(sid)) {
				System.out.println("删除成功！");
			}else {
				System.out.println("删除失败！");
			}
			
			Client.showMenu();
		}else if (num == 3) {
			Student stu = new Student();
			int sid;
			System.out.print("请输入要查询学生的sid：");
			sid = sc.nextInt();
			stu = stuServer.search(sid);
			System.out.println(stu);

			Client.showMenu();
		}else if (num == 4) {
			stuServer.showAll();
			
			Client.showMenu();
		}else if (num == 5) {
			String sql;
			System.out.print("请输入自定义sql语句：");
			sql = sc.nextLine();
			sql = sc.nextLine();
			stuServer.exeCustom(sql);
			
			
			Client.showMenu();
//			INSERT INTO `t_student` VALUES (null, '孙悟空', '男', 18, '159384555',  20);
		}
		
		else{
			System.out.println("无效的命令！");
			Client.showMenu();
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test();
		showMenu();
	}

}

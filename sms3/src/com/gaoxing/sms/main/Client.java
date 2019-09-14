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
		System.out.println("��\t��ӭ����ѧ������ϵͳ\t��");
		System.out.println("-------------------------");
		System.out.println("��\t���������ּ�+enter������");
		System.out.println("��\t1.���ѧ��\t\t��\n��\t2.ɾ��ѧ��\t\t��\n��\t3.����ѧ��\t\t��\n��\t4.��ʾ����\t\t��\n��\t5.�Զ���sql\t��");
		System.out.println("-------------------------");
		System.out.print("�������������");
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
					System.out.print("������ѧ��������");
					name = sc.nextLine();
					name = sc.nextLine();
				}else if (i == 1) {
					System.out.print("������ѧ���Ա�");
					sex = sc.nextLine();
				}else if (i == 2) {
					System.out.print("������ѧ�����䣺");
					age = sc.nextInt();
				}else if (i == 3) {
					System.out.print("������ѧ�����룺");
					mobile = sc.nextLine();
					mobile = sc.nextLine();
				}else if (i == 4) {
					System.out.print("������ѧ���༶id��");
					classId = sc.nextInt();
				}
			}
			
			stu.setSname(name);
			stu.setSex(sex);
			stu.setAge(age);
			stu.setMobile(mobile);
			stu.setClassId(classId);
			if (stuServer.add(stu)) {
				System.out.println("��ӳɹ���");
			}else {
				System.out.println("���ʧ�ܣ�");
			}
			
			Client.showMenu();
		}else if (num == 2) {
			int sid;
			System.out.print("������ѧ����sid��");
			sid = sc.nextInt();
			
			if (stuServer.del(sid)) {
				System.out.println("ɾ���ɹ���");
			}else {
				System.out.println("ɾ��ʧ�ܣ�");
			}
			
			Client.showMenu();
		}else if (num == 3) {
			Student stu = new Student();
			int sid;
			System.out.print("������Ҫ��ѯѧ����sid��");
			sid = sc.nextInt();
			stu = stuServer.search(sid);
			System.out.println(stu);

			Client.showMenu();
		}else if (num == 4) {
			stuServer.showAll();
			
			Client.showMenu();
		}else if (num == 5) {
			String sql;
			System.out.print("�������Զ���sql��䣺");
			sql = sc.nextLine();
			sql = sc.nextLine();
			stuServer.exeCustom(sql);
			
			
			Client.showMenu();
//			INSERT INTO `t_student` VALUES (null, '�����', '��', 18, '159384555',  20);
		}
		
		else{
			System.out.println("��Ч�����");
			Client.showMenu();
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test();
		showMenu();
	}

}

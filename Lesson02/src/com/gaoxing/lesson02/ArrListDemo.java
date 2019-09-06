package com.gaoxing.lesson02;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	private String name;
	private String sex;
	private int age;
	private int id;

	public Student(String name, String sex, int age, int id) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class DoSomeThing {
	private DoSomeThing() {};
	


	public static boolean add(ArrayList list, Student s) {
		// 增加学生
		int oldLength = list.size();
		list.add(s);
		int newLength = list.size();
		if (oldLength < newLength) {
			System.out.println("成功添加一名学生！ =>" + "姓名 =" + s.getName() + "\t" + "性别 = " + s.getSex() + "\t" + "年龄 = "
					+ s.getAge() + "\t" + "学号 = " + s.getId());
			
			return true;

		} else {
			System.out.println("error，添加失败！");
			
			return false;
		}

	}
	
	

	public static boolean remove(ArrayList<Student> list, int id) {
		// 移出学生
		int oldLength = list.size();
		Integer i = new Integer(id);
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			// list.remove(0);
			Student s = iter.next();
			
			if (i.equals(s.getId())) {
				iter.remove();
			}

		}

		int newLength = list.size();
		if (oldLength > newLength) {
			System.out.println("\n移出学号为：" + id + "的学生成功");
			
			return true;
		} else {
			System.out.println("error,移出失败！");
			return false;
		}
	}

	public static void showAll(ArrayList<Student> list) {

		System.out.println("\n显示所有成员：");
		System.out.println("姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "学号");
		System.out.println("--------------------------");
		for (Student s : list) {
			System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getAge() + "\t" + s.getId());
		}

	}

	public static boolean query(ArrayList<Student> list, int id) {
		// 根据学号查学生信息
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			// list.remove(0);
			Student s = iter.next();
			Integer i = new Integer(id);
			if (i.equals(s.getId())) {
				System.out.println("\n查询学号为" + id + "的信息为：");
				System.out.println("姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "学号");
				System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getAge() + "\t" + s.getId());
				
				return true;
			}

		}
		return false;

	}
	// 需要的参数，要编辑的集合，新名字，新年龄，新性别, 传过来的学号
	public static boolean edit(ArrayList<Student> list,String name,String sex,int age,int id) {
		Integer i = new Integer(id);
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student s = (Student) iter.next();
			if (i.equals(s.getId())) {
				s.setName(name);
				s.setAge(age);
				s.setSex(sex);
				System.out.println("\n学生信息编辑成功！！\n");
				return true;
			}
			
		}
		return false;
	}
		
	

}

public class ArrListDemo {
	static String name, sex;
	static int age, id;
	static String index;
	static ArrayList<Student> list = new ArrayList<Student>();

	// 展示菜单
	public static void showMenu() {
		System.out.println("----------------------------------");
		System.out.println("｜\t欢迎来到学生信息管理系统！\t｜");
		System.out.println("｜-------------------------------｜");
		System.out.println("｜\t按以下数字+enter键进行操作!\t｜");
		System.out.println("｜\t\t\t\t｜");
		System.out.println("｜\t1.添加学生\t\t\t｜");
		System.out.println("｜\t2.所有学生\t\t\t｜");
		System.out.println("｜\t3.查询学生\t\t\t｜");
		System.out.println("｜\t4.删除学生\t\t\t｜");
		System.out.println("｜\t5.清空学生\t\t\t｜");
		System.out.println("｜\t6.自动演示\t\t\t｜");
		System.out.println("｜\t7.编辑学生\t\t\t｜");
		System.out.println("｜\t\t\t\t｜");
		System.out.println("｜-------------------------------｜");
		Scanner Sc = new Scanner(System.in);
		String str = Sc.nextLine();
		if (str.equals("1")) {
			System.out.println("\n----1.添加学生----\n");

			for (int i = 0; i < 4; i++) {
				if (i == 0) {
					// 存储姓名
					System.out.print("请输入学生姓名：");
					name = Sc.nextLine();
				} else if (i == 1) {
					// 存储性别
					System.out.print("请输入学生性别：");
					sex = Sc.nextLine();
				} else if (i == 2) {
					// 存储年龄
					System.out.print("请输入学生年龄：");
					age = Sc.nextInt();
				} else if (i == 3) {
					// 存储学号
					System.out.print("请输入学生学号：");
					id = Sc.nextInt();
				}
			}

			
			DoSomeThing.add(list, new Student(name, sex, age, id));
			DoSomeThing.showAll(list);
			ArrListDemo.showMenu();
		} else if (str.equals("2")) {
			DoSomeThing.showAll(list);
			ArrListDemo.showMenu();
		} else if (str.equals("3")) {
			System.out.print("请输入学生学号：");
			index =  Sc.nextLine();
			DoSomeThing.query(list, Integer.valueOf(index));
			ArrListDemo.showMenu();
		} else if (str.equals("4")) {
			System.out.print("请输入学生学号：");
			index =  Sc.nextLine();
			DoSomeThing.remove(list, Integer.valueOf(index));
			ArrListDemo.showMenu();
		} else if (str.equals("5")) {
			list.clear();
			System.out.println("已清空所有学生信息");
			ArrListDemo.showMenu();
		} else if (str.equals("6")) {
			// 创建学生对象 
			Student s1 = new Student("阿猫", "女", 20, 1);
			Student s2 = new Student("阿狗", "男", 22, 2); 
			Student s3 = new Student("张三", "男", 19, 3);
			Student s4 = new Student("阿尔", "女", 20, 4);
			
			 // 添加学生对象 
			
			DoSomeThing.add(list, s1);
			DoSomeThing.add(list, s2);
			DoSomeThing.add(list, s3);
			DoSomeThing.add(list, s4);
			// 遍历学生对象
			DoSomeThing.showAll(list);
			// 根据id删除学生
			DoSomeThing.remove(list, 1);
			// 遍历学生对象
			DoSomeThing.showAll(list);
			// 根据学号查学生信息 
			DoSomeThing.query(list, 2);
			
			ArrListDemo.showMenu();
		}else if(str.equals("7")){
			System.out.print("请输入待编辑学生学号：");
			int id = Sc.nextInt();
			DoSomeThing.query(list, id);
			
			
			for(int i = 0;i < 3;i++) {
				if (i == 0) {
					System.out.print("请输入该学生的新姓名：");
					name = Sc.nextLine();//修复缓冲区自动输入空格问题
					name = Sc.nextLine();
				}else if (i == 1) {
					System.out.print("请输入该学生的新性别：");
					sex = Sc.nextLine();
				}else if (i == 2) {
					System.out.print("请输入该学生的新年龄：");
					age = Sc.nextInt();
				}
			}
			
			
			DoSomeThing.edit(list, name, sex, age, id);
			
			ArrListDemo.showMenu();
			
		}else {
			System.out.println("无效的指令！！");
			ArrListDemo.showMenu();
		}

	}

	public static void main(String[] args) {

		ArrListDemo.showMenu();

	}

}

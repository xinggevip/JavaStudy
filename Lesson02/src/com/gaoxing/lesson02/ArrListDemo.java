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
		// ����ѧ��
		int oldLength = list.size();
		list.add(s);
		int newLength = list.size();
		if (oldLength < newLength) {
			System.out.println("�ɹ����һ��ѧ���� =>" + "���� =" + s.getName() + "\t" + "�Ա� = " + s.getSex() + "\t" + "���� = "
					+ s.getAge() + "\t" + "ѧ�� = " + s.getId());
			
			return true;

		} else {
			System.out.println("error�����ʧ�ܣ�");
			
			return false;
		}

	}
	
	

	public static boolean remove(ArrayList<Student> list, int id) {
		// �Ƴ�ѧ��
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
			System.out.println("\n�Ƴ�ѧ��Ϊ��" + id + "��ѧ���ɹ�");
			
			return true;
		} else {
			System.out.println("error,�Ƴ�ʧ�ܣ�");
			return false;
		}
	}

	public static void showAll(ArrayList<Student> list) {

		System.out.println("\n��ʾ���г�Ա��");
		System.out.println("����" + "\t" + "�Ա�" + "\t" + "����" + "\t" + "ѧ��");
		System.out.println("--------------------------");
		for (Student s : list) {
			System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getAge() + "\t" + s.getId());
		}

	}

	public static boolean query(ArrayList<Student> list, int id) {
		// ����ѧ�Ų�ѧ����Ϣ
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			// list.remove(0);
			Student s = iter.next();
			Integer i = new Integer(id);
			if (i.equals(s.getId())) {
				System.out.println("\n��ѯѧ��Ϊ" + id + "����ϢΪ��");
				System.out.println("����" + "\t" + "�Ա�" + "\t" + "����" + "\t" + "ѧ��");
				System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getAge() + "\t" + s.getId());
				
				return true;
			}

		}
		return false;

	}
	// ��Ҫ�Ĳ�����Ҫ�༭�ļ��ϣ������֣������䣬���Ա�, ��������ѧ��
	public static boolean edit(ArrayList<Student> list,String name,String sex,int age,int id) {
		Integer i = new Integer(id);
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student s = (Student) iter.next();
			if (i.equals(s.getId())) {
				s.setName(name);
				s.setAge(age);
				s.setSex(sex);
				System.out.println("\nѧ����Ϣ�༭�ɹ�����\n");
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

	// չʾ�˵�
	public static void showMenu() {
		System.out.println("----------------------------------");
		System.out.println("��\t��ӭ����ѧ����Ϣ����ϵͳ��\t��");
		System.out.println("��-------------------------------��");
		System.out.println("��\t����������+enter�����в���!\t��");
		System.out.println("��\t\t\t\t��");
		System.out.println("��\t1.���ѧ��\t\t\t��");
		System.out.println("��\t2.����ѧ��\t\t\t��");
		System.out.println("��\t3.��ѯѧ��\t\t\t��");
		System.out.println("��\t4.ɾ��ѧ��\t\t\t��");
		System.out.println("��\t5.���ѧ��\t\t\t��");
		System.out.println("��\t6.�Զ���ʾ\t\t\t��");
		System.out.println("��\t7.�༭ѧ��\t\t\t��");
		System.out.println("��\t\t\t\t��");
		System.out.println("��-------------------------------��");
		Scanner Sc = new Scanner(System.in);
		String str = Sc.nextLine();
		if (str.equals("1")) {
			System.out.println("\n----1.���ѧ��----\n");

			for (int i = 0; i < 4; i++) {
				if (i == 0) {
					// �洢����
					System.out.print("������ѧ��������");
					name = Sc.nextLine();
				} else if (i == 1) {
					// �洢�Ա�
					System.out.print("������ѧ���Ա�");
					sex = Sc.nextLine();
				} else if (i == 2) {
					// �洢����
					System.out.print("������ѧ�����䣺");
					age = Sc.nextInt();
				} else if (i == 3) {
					// �洢ѧ��
					System.out.print("������ѧ��ѧ�ţ�");
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
			System.out.print("������ѧ��ѧ�ţ�");
			index =  Sc.nextLine();
			DoSomeThing.query(list, Integer.valueOf(index));
			ArrListDemo.showMenu();
		} else if (str.equals("4")) {
			System.out.print("������ѧ��ѧ�ţ�");
			index =  Sc.nextLine();
			DoSomeThing.remove(list, Integer.valueOf(index));
			ArrListDemo.showMenu();
		} else if (str.equals("5")) {
			list.clear();
			System.out.println("���������ѧ����Ϣ");
			ArrListDemo.showMenu();
		} else if (str.equals("6")) {
			// ����ѧ������ 
			Student s1 = new Student("��è", "Ů", 20, 1);
			Student s2 = new Student("����", "��", 22, 2); 
			Student s3 = new Student("����", "��", 19, 3);
			Student s4 = new Student("����", "Ů", 20, 4);
			
			 // ���ѧ������ 
			
			DoSomeThing.add(list, s1);
			DoSomeThing.add(list, s2);
			DoSomeThing.add(list, s3);
			DoSomeThing.add(list, s4);
			// ����ѧ������
			DoSomeThing.showAll(list);
			// ����idɾ��ѧ��
			DoSomeThing.remove(list, 1);
			// ����ѧ������
			DoSomeThing.showAll(list);
			// ����ѧ�Ų�ѧ����Ϣ 
			DoSomeThing.query(list, 2);
			
			ArrListDemo.showMenu();
		}else if(str.equals("7")){
			System.out.print("��������༭ѧ��ѧ�ţ�");
			int id = Sc.nextInt();
			DoSomeThing.query(list, id);
			
			
			for(int i = 0;i < 3;i++) {
				if (i == 0) {
					System.out.print("�������ѧ������������");
					name = Sc.nextLine();//�޸��������Զ�����ո�����
					name = Sc.nextLine();
				}else if (i == 1) {
					System.out.print("�������ѧ�������Ա�");
					sex = Sc.nextLine();
				}else if (i == 2) {
					System.out.print("�������ѧ���������䣺");
					age = Sc.nextInt();
				}
			}
			
			
			DoSomeThing.edit(list, name, sex, age, id);
			
			ArrListDemo.showMenu();
			
		}else {
			System.out.println("��Ч��ָ���");
			ArrListDemo.showMenu();
		}

	}

	public static void main(String[] args) {

		ArrListDemo.showMenu();

	}

}

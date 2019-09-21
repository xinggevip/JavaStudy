package com.xing.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestRef {

	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ���
		
		Class clazz1 = Class.forName("com.xing.reflect.Person");
		
		
		Class clazz2 = Person.class;
		
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2); // true
		System.out.println(clazz2 == clazz3); // true
		
		System.out.println("----------------");
		
		// ͨ���ֽ��봴������
		Person p2 = (Person)clazz1.newInstance();
		p2.setName("tom");
		System.out.println(p2.getName()); // tom
		
		// ͨ���вι�������������
		Constructor c = clazz1.getConstructor(String.class,Integer.class);
		Person p3 = (Person)c.newInstance("�߹���",18);
		System.out.println(p3.getName()); // �߹���
		
		// ��ȡ&&���ù����ֶ�,public�������ֶ�
		Field f = clazz1.getField("name");
		f.set(p3, "���");
		System.out.println(p3.getName()); // ���
		
		// ��ȡ&&����˽���ֶ�
		Field f2 = clazz1.getDeclaredField("sex");
		// ȥ��˽�л�
		f2.setAccessible(true);
		f2.set(p3, "��");
		System.out.println(p3.getSex()); // ��
		
		System.out.println("-----------------");
		
		// ��ȡ&&ִ�й�������
		Method m1 = clazz1.getMethod("getName");
		System.out.println( m1.invoke(p2) ); // tom
		
		// ��ȡ&&ִ��˽�з���
		Method m2 = clazz1.getDeclaredMethod("eat", String.class);
		// ȥ��˽�л�
		m2.setAccessible(true);
		m2.invoke(p2,"�������"); // tom�Թ������
		
		System.out.println("---------------------");
		
		// ͨ�������ƹ����Ϸ��ͼ��
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		// ��ȡArrayList���ֽ���
		Class<?> clazz4 = Class.forName("java.util.ArrayList");
		Method m3 = clazz4.getMethod("add", Object.class);
		m3.invoke(list, "gaoxing");
		System.out.println(list); // [10, gaoxing]
		
		
		
		
	}

}

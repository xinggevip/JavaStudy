package com.xing.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestRef {

	public static void main(String[] args) throws Exception {
		// 获取字节码
		
		Class clazz1 = Class.forName("com.xing.reflect.Person");
		
		
		Class clazz2 = Person.class;
		
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2); // true
		System.out.println(clazz2 == clazz3); // true
		
		System.out.println("----------------");
		
		// 通过字节码创建对象
		Person p2 = (Person)clazz1.newInstance();
		p2.setName("tom");
		System.out.println(p2.getName()); // tom
		
		// 通过有参构造器创建对象
		Constructor c = clazz1.getConstructor(String.class,Integer.class);
		Person p3 = (Person)c.newInstance("高公子",18);
		System.out.println(p3.getName()); // 高公子
		
		// 获取&&设置公共字段,public声明的字段
		Field f = clazz1.getField("name");
		f.set(p3, "李白");
		System.out.println(p3.getName()); // 李白
		
		// 获取&&设置私有字段
		Field f2 = clazz1.getDeclaredField("sex");
		// 去除私有化
		f2.setAccessible(true);
		f2.set(p3, "男");
		System.out.println(p3.getSex()); // 男
		
		System.out.println("-----------------");
		
		// 获取&&执行公共方法
		Method m1 = clazz1.getMethod("getName");
		System.out.println( m1.invoke(p2) ); // tom
		
		// 获取&&执行私有方法
		Method m2 = clazz1.getDeclaredMethod("eat", String.class);
		// 去除私有化
		m2.setAccessible(true);
		m2.invoke(p2,"贵族板面"); // tom吃贵族板面
		
		System.out.println("---------------------");
		
		// 通过反射绕过集合泛型检测
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		// 获取ArrayList的字节码
		Class<?> clazz4 = Class.forName("java.util.ArrayList");
		Method m3 = clazz4.getMethod("add", Object.class);
		m3.invoke(list, "gaoxing");
		System.out.println(list); // [10, gaoxing]
		
		
		
		
	}

}

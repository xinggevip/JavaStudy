package ����.����.lesson01;

import java.util.ArrayList;

class Dog<T>{
	T name;

	public T getName() {
		return name;
	}
}

class Student{
	
	<T> void test(T a){
		System.out.println(a.getClass());
	}
	
	static <T> void test2(T name) {
		System.out.println(name.getClass());
	}
	
	<T> T test3(T age) {
		return age;
	}
}

public class lesson01 {

	public static void main(String[] args) {
		
		// ���⣺������Arrrylist����κζ���
		ArrayList list = new ArrayList();
		list.add("a");
		list.add(10);
		list.add(true);
		// ����������ʱ��������Ͳ�һ�»ᱨ��
		// ���ص��������Ͷ���Object
		Object obj = list.get(0);
		
		// ������
		Dog<String> dog1 = new Dog<String>();
		Dog<Integer> dog2 = new Dog<Integer>();
		dog1.getName(); // ����String����
		dog2.getName(); // ����Integer����
		
		// ���ͷ���
		new Student().test("Tom"); // ���String����
		new Student().test(10);  // ���Integer����
		Student.test2("jal");    // ���String����
		System.out.println(new Student().test3(12).getClass());  // ���Integer
		


	}

}

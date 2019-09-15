package 集合.泛型.lesson01;

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
		
		// 问题：可以往Arrrylist里存任何东西
		ArrayList list = new ArrayList();
		list.add("a");
		list.add(10);
		list.add(true);
		// 迭代遍历得时候如果类型不一致会报错
		// 返回得所有类型都是Object
		Object obj = list.get(0);
		
		// 泛型类
		Dog<String> dog1 = new Dog<String>();
		Dog<Integer> dog2 = new Dog<Integer>();
		dog1.getName(); // 返回String类型
		dog2.getName(); // 返回Integer类型
		
		// 泛型方法
		new Student().test("Tom"); // 输出String类型
		new Student().test(10);  // 输出Integer类型
		Student.test2("jal");    // 输出String类型
		System.out.println(new Student().test3(12).getClass());  // 输出Integer
		


	}

}

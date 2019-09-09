package 集合.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



class Dog{
	private String name;
	public Dog(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}

public class CollectionDemo {
	
	static void commonMethods() {
		int[] arr = {1,2,3,4,5,6};
		arr[0] = 50;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-------------");
		
		Collection c1 = new ArrayList();
		// 增
		c1.add("Hello");
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add(10); // 会自动装箱
		System.out.println(c1.toString()); // [Hello, a, b, c, 10]
		
		// 删
		c1.remove("Hello");
		System.out.println(c1.toString()); // [a, b, c, 10]
		
		// 清空
		c1.clear();
		System.out.println(c1.toString()); // []
		
		// 是否为空
		System.out.println( c1.isEmpty() ); // true
		
		// 获取长度
		c1.add("a");
		c1.add("b");
		c1.add("c");
		System.out.println(c1.size()); // 3
	}

	static void arrEach() {
		System.out.println("--------------");
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		// ArrayList转数组
		Object[] arr = c1.toArray();
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------");
		Collection c2 = new ArrayList();
		c2.add(new Dog("wc"));
		c2.add(new Dog("tom"));
		c2.add(new Dog("八公"));
		
		
		// ArrayList转数组
		Object[] arr2 = c2.toArray();// 向上转型
		for(int i = 0;i < arr2.length;i++) {
			Dog dog = (Dog)arr2[i];// 转回Dog
			System.out.println(dog.getName());
		}
		
		
		
		
		
	}

	static void addAll() {
		System.out.println("----------------");
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		Collection c2 = new ArrayList();
		c2.add("d");
		c2.add("e");
		c2.add("f");
		
		c1.addAll(c2);
		
		System.out.println(c1); // [a, b, c, d, e, f]
		
		// 从c1当中删除两个集合的交集和c2
		c1.removeAll(c2);
		System.out.println(c1);  // [a, b, c]
		
		// c1是否全部包含c2
		Boolean res = c1.containsAll(c2);
		System.out.println(res);
		
		// 取交集赋值给调用者，返回boolean，调用者有变化返回true，否则为假
		Boolean res2 = c1.retainAll(c2);
		System.out.println(c1); // []
		System.out.println(res2); // true
		
		
		
		
		
		
		
	}

	static void TestIterator() {
		System.out.println("使用迭代器遍历-----------");
		// 迭代器遍历
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		// 迭代器会自动把类型转换成Object
		Iterator iter = c1.iterator();
		
//		Object obj1 = iter.next();
//		System.out.println(obj1);
//		Object obj2 = iter.next();
//		System.out.println(obj2);
		
		while(iter.hasNext()) {
//			Object obj1 = iter.next();
			System.out.println(iter.next());
		}
	}

	static void CustomTterator() {
		System.out.println("遍历自定义类--------------");
		Collection c1 = new ArrayList();
		c1.add(new Dog("小狗"));
		c1.add(new Dog("中狗"));
		c1.add(new Dog("大狗"));
		
		Iterator it = c1.iterator();
		while (it.hasNext()) {
			Dog dog = (Dog) it.next();
			System.out.println(dog.getName());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// 常用方法
		commonMethods();
		
		// 遍历
		arrEach();
		
		// 合并
		addAll();
		
		// 迭代器遍历
		TestIterator();
		
		// 迭代器遍历自定义类
		CustomTterator();
		
		
		
		
		

	}

}

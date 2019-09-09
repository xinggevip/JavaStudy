package ����.collection;

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
		// ��
		c1.add("Hello");
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add(10); // ���Զ�װ��
		System.out.println(c1.toString()); // [Hello, a, b, c, 10]
		
		// ɾ
		c1.remove("Hello");
		System.out.println(c1.toString()); // [a, b, c, 10]
		
		// ���
		c1.clear();
		System.out.println(c1.toString()); // []
		
		// �Ƿ�Ϊ��
		System.out.println( c1.isEmpty() ); // true
		
		// ��ȡ����
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
		// ArrayListת����
		Object[] arr = c1.toArray();
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------");
		Collection c2 = new ArrayList();
		c2.add(new Dog("wc"));
		c2.add(new Dog("tom"));
		c2.add(new Dog("�˹�"));
		
		
		// ArrayListת����
		Object[] arr2 = c2.toArray();// ����ת��
		for(int i = 0;i < arr2.length;i++) {
			Dog dog = (Dog)arr2[i];// ת��Dog
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
		
		// ��c1����ɾ���������ϵĽ�����c2
		c1.removeAll(c2);
		System.out.println(c1);  // [a, b, c]
		
		// c1�Ƿ�ȫ������c2
		Boolean res = c1.containsAll(c2);
		System.out.println(res);
		
		// ȡ������ֵ�������ߣ�����boolean���������б仯����true������Ϊ��
		Boolean res2 = c1.retainAll(c2);
		System.out.println(c1); // []
		System.out.println(res2); // true
		
		
		
		
		
		
		
	}

	static void TestIterator() {
		System.out.println("ʹ�õ���������-----------");
		// ����������
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		// ���������Զ�������ת����Object
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
		System.out.println("�����Զ�����--------------");
		Collection c1 = new ArrayList();
		c1.add(new Dog("С��"));
		c1.add(new Dog("�й�"));
		c1.add(new Dog("��"));
		
		Iterator it = c1.iterator();
		while (it.hasNext()) {
			Dog dog = (Dog) it.next();
			System.out.println(dog.getName());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// ���÷���
		commonMethods();
		
		// ����
		arrEach();
		
		// �ϲ�
		addAll();
		
		// ����������
		TestIterator();
		
		// �����������Զ�����
		CustomTterator();
		
		
		
		
		

	}

}

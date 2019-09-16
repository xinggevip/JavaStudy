package ����.set;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int num = this.age - o.age;// ���ֱ��return��䣬���൱��һ���Ӵ��� ����һֱ�����˾���ȣ��ⲻ�������������´�����
//		if (num == 0) {
//			return this.name.compareTo(o.name);
//		}else {
//			return num;
//		}
		
		// ��Ŀ�����  ����ע�ʹ���ļ�д
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
	
}

public class Lesson07 {

	public static void main(String[] args) {
		
		// TreeSet����ֱ�Ӱ��Զ��������ӵ�TreeSet��
		/**
		 * ��Ҫ���Զ��������ӵ�TreeSet����Ҫ��
		 * 1.ʵ��Comparable�ӿ�
		 * 2.����campareTo����
		 * return Ϊ�������������˳��洢��Ϊ�������������˳�������洢��Ϊ0��֮�洢��ӵĵ�һ������d
		 */
		TreeSet<Person> set1 = new TreeSet<>();
		set1.add(new Person("Tom",20));
		set1.add(new Person("Jac",25));
		set1.add(new Person("Marry",22));
		set1.add(new Person("Tonny",21));
		set1.add(new Person("Tonny",19));
		set1.add(new Person("Tom",20));
		
		System.out.println(set1);
	}

}

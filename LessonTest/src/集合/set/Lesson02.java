package ����.set;

import java.util.HashSet;
import java.util.Set;

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}

public class Lesson02 {
	public static void main(String[] args) {
		
		// ��Ҫ��Set��ʵ���Զ������ȥ��
		// 1.����equals
		// 2.����hashCode
		
		Set<Student> s1 = new HashSet<>();
		s1.add(new Student("С��", 10));
		s1.add(new Student("С��", 10));
		s1.add(new Student("С��", 11));
		s1.add(new Student("Сǿ", 11));
		
		System.out.println(s1);
		
		
	}
}

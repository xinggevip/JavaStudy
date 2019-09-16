package ����.map;

import java.util.HashMap;

class Student{
	String name;
	Integer age;
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
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
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class Lesson04 {
	
	public static void main(String[] args) {
		HashMap<Student, String> maps = new HashMap<>();
		maps.put(new Student("����", 18), "����");
		maps.put(new Student("����", 19), "����");
		maps.put(new Student("����", 18), "����");
		System.out.println(maps); // Ĭ�ϱȵ��ǵ�ַ������û�и�������
		
		// ��������û�и�������,��Ҫ����Student��equals����
		
		
		
		
		

	}

}

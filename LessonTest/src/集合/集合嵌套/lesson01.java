package ����.����Ƕ��;

import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}

public class lesson01 {

	public static void main(String[] args) {
		/**
		 * ѧ�ƣ��༶��ѧ��
		 */
		
		// ����ѧ��
		Student s1 = new Student("zs");
		Student s2 = new Student("ls");
		// �����༶1
		List<Student> c1 = new ArrayList<Student>();
		// ��ѧ��װ���༶1
		c1.add(s1);
		c1.add(s2);
		
		
		// ����ѧ��
		Student s3 = new Student("ww");
		Student s4 = new Student("zl");
		// �����༶2
		List<Student> c2 = new ArrayList<Student>();	// ���ϵ��д�ż���
		// ��ѧ��װ���༶2
		c2.add(s3);
		c2.add(s4);
		
		
		// ����ѧ��
		List<List<Student>> xk1 = new ArrayList<>();
		xk1.add(c1);
		xk1.add(c2);
		
		
		// �Ѱ༶��������ѧ��������ӡ����
		
		for (List<Student> c : xk1) {
			for (Student student : c) {
				System.out.println(student);
			}
		}
		
		
		
		
		
		
		

	}

}

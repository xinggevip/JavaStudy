package 集合.集合嵌套;

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
		 * 学科，班级，学生
		 */
		
		// 创建学生
		Student s1 = new Student("zs");
		Student s2 = new Student("ls");
		// 创建班级1
		List<Student> c1 = new ArrayList<Student>();
		// 把学生装进班级1
		c1.add(s1);
		c1.add(s2);
		
		
		// 创建学生
		Student s3 = new Student("ww");
		Student s4 = new Student("zl");
		// 创建班级2
		List<Student> c2 = new ArrayList<Student>();	// 集合当中存放集合
		// 把学生装进班级2
		c2.add(s3);
		c2.add(s4);
		
		
		// 创建学科
		List<List<Student>> xk1 = new ArrayList<>();
		xk1.add(c1);
		xk1.add(c2);
		
		
		// 把班级当中所有学生姓名打印出来
		
		for (List<Student> c : xk1) {
			for (Student student : c) {
				System.out.println(student);
			}
		}
		
		
		
		
		
		
		

	}

}

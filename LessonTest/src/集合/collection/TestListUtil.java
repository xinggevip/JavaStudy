package 集合.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

class Student{
	String name;
	int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 重写比较两个对象，默认是比较地址，重写后是比较值
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

// list集合去重工具类设计
class ListUtil{
	private ListUtil() {};
	public static ArrayList getSingleEle(ArrayList list) {
		ArrayList newList = new ArrayList();
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if (!newList.contains(object)) { // 比较两个值是否相等
				newList.add(object);
			}
		}
		
		return newList;
	}
}

public class TestListUtil {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("e");
		list.add("f");
		
		ArrayList newList = ListUtil.getSingleEle(list);
		System.out.println(newList); // [a, b, e, f]
		
		// 
		Student s1 = new Student("张三",18);
		Student s2 = new Student("张三",18);
		Student s3 = new Student("李四",19);
		Student s4 = new Student("王五",21);
		
		ArrayList stuList = new ArrayList();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		stuList.add(s4);
	
		ArrayList newStuList = ListUtil.getSingleEle(stuList);
		ListIterator it = newStuList.listIterator();
		while (it.hasNext()) {
			Student object = (Student) it.next();
			System.out.println(object); // Student [name=张三, age=18] Student [name=李四, age=19] Student [name=王五, age=21]
		}
		

		
		

	}

}

package 集合.set;

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
		int num = this.age - o.age;// 如果直接return这句，就相当于一棒子打死 年龄一直两个人就相等，这不合理，所以用以下代码解决
//		if (num == 0) {
//			return this.name.compareTo(o.name);
//		}else {
//			return num;
//		}
		
		// 三目运算符  上面注释代码的简写
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
	
}

public class Lesson07 {

	public static void main(String[] args) {
		
		// TreeSet不能直接把自定义对象添加到TreeSet中
		/**
		 * 若要把自定义对象添加到TreeSet中需要：
		 * 1.实现Comparable接口
		 * 2.覆盖campareTo方法
		 * return 为正数，按照添加顺序存储，为负数，按照添加顺序的逆序存储，为0则之存储添加的第一个对象d
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

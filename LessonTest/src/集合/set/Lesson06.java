package 集合.set;

import java.util.TreeSet;

public class Lesson06 {

	public static void main(String[] args) {
		// ThreeSet不重复，自动排序
		
		// 排数字
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(9);
		set1.add(20);
		set1.add(3);
		set1.add(7);
		System.out.println(set1); // [3, 7, 9, 10, 20]
		
		// 排字母
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("a");
		set2.add("z");
		set2.add("y");
		set2.add("f");
		System.out.println(set2); // [a, f, y, z]
		
		// 排汉字  排序规则是按照unicode码
		TreeSet<String> set3 = new TreeSet<>();
		set3.add("星");
		set3.add("哥");
		set3.add("无");
		set3.add("敌");
		System.out.println(set3);
		
		

	}

}

package 集合.set;

import java.util.LinkedHashSet;

public class Lesson03 {

	public static void main(String[] args) {

		/**
		 * LinkedHashSet是HashSet的子类
		 * 他是使用链表实现的，是Set集合中，保证唯一和顺序
		 * HashSet保证唯一，
		 */
		
		LinkedHashSet<String> s1 = new LinkedHashSet<>();
		s1.add("a");
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("d");
		System.out.println(s1);
		

	}

}

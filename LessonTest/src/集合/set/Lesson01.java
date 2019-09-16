package ����.set;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lesson01 {
	public static void main(String[] args) {
		// set���������Ҳ����ظ�
		Set<String> s1 = new HashSet<>();
		boolean b1 = s1.add("a");
		boolean b2 = s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("d");
		s1.add("e");
		s1.add("f");
		System.out.println(b1);	// true
		System.out.println(b2);	// false
		System.out.println(s1); // [a]
		
		System.out.println("------------------");
		
		// ���ǿ���ʹ�õ������Ķ�����ʹ����ǿforѭ����foreach
		Iterator<String> it = s1.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
		
		System.out.println("------------------");
		
		for (String str : s1) {
			System.out.println(str);
		}
		
	}

}

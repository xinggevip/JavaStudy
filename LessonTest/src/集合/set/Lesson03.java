package ����.set;

import java.util.LinkedHashSet;

public class Lesson03 {

	public static void main(String[] args) {

		/**
		 * LinkedHashSet��HashSet������
		 * ����ʹ������ʵ�ֵģ���Set�����У���֤Ψһ��˳��
		 * HashSet��֤Ψһ��
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

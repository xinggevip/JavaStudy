package ����.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import �������.�ڲ���.�ֲ��ڲ���.Test;

public class Lesson05 {
	
	static void test() {
		String str;
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Character> s1 = new LinkedHashSet<>();
		
		System.out.print("�������ַ�����");
		str = sc.nextLine();
		char[] carr = str.toCharArray();
		System.out.println(Arrays.toString(carr));
		
		for (char c : carr) {
			s1.add(c);
		}
		System.out.println(s1);
		
		
	}

	public static void main(String[] args) {
		/**
		 * �ַ���ȥ��
		 * Ҫ��
		 * ���룺aaabbbcc
		 * �����abc
		 */
		
		
		test();
		
		
		Scanner sc = new Scanner(System.in);
		String str;
		String newStr = "";
		LinkedHashSet<String> s1 = new LinkedHashSet<>();
		System.out.println("�������ַ�����");
		str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			s1.add(str.substring(i, i+1));
		}
		
		System.out.println("ȥ�غ�ý��Ϊ��");
		System.out.println(s1);
		
		for (String str1 : s1) {
			newStr += str1;
		}
		
		System.out.println("newStr = " + newStr);
		
		
	}

}

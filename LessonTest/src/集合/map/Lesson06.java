package ����.map;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson06 {

	public static void main(String[] args) {
		// �ж�ÿ���ַ����ֵĴ���
		
		Scanner sc = new Scanner(System.in);
		String str;
		char[] carr;
		HashMap<Character, Integer> maps = new HashMap<>();
		System.out.print("�������ַ�����");
		str = sc.nextLine();
		carr = str.toCharArray();
		
		for (char c : carr) {
			if (!maps.containsKey(c)) {
				// ���ӳ���key�в����ڸ�key����Ѹ�key��ӽ�ӳ��
				maps.put(c, 1);
			}else {
				// ���ӳ���key���Ѵ��ڸ�key�����ø�entry��value��1
				maps.put(c, maps.get(c) + 1);
			}
		}
		
		System.out.println("�ַ������ֵĴ���ͳ��Ϊ��");
		System.out.println(maps);
		
		
		
		

	}

}

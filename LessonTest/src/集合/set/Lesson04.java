package ����.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Lesson04 {

	public static void main(String[] args) {
		// ��ȡ1-20֮��������
		// ��ȡʮ��
		// ���������ظ�
		
		/**
		 * ʵ�֣�
		 * 1.ʹ��Rondom�࣬����������ɽ����
		 * 2.�������ɽ���ü��ϣ�HashSet
		 * 3.��HashSet.size����10��ʱ�򣬾Ͳ�������
		 */
		
		Random r = new Random();
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		
		while(!(s1.size() >= 10)) {
			int num = r.nextInt(20) + 1;
			s1.add(num);
		}
		System.out.println(s1);
		
	}

}

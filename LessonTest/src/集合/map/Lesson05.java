package ����.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Lesson05 {

	public static void main(String[] args) {
		/**
		 * HashMap���е�Ԫ���������
		 * LinkedHashMap �������
		 */
		
		HashMap<String, Integer> maps1 = new HashMap<>();
		maps1.put("����", 18);
		maps1.put("����", 19);
		maps1.put("����", 20);
		System.out.println(maps1);
		
		
		LinkedHashMap<String, Integer> maps2 = new LinkedHashMap<>();
		maps2.put("����", 18);
		maps2.put("����", 19);
		maps2.put("����", 20);
		System.out.println(maps2);
		
		

	}

}

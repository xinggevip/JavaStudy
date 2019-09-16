package ����.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Lesson02 {

	public static void main(String[] args) {
		// ����ӳ��
		HashMap<String, Object> maps = new HashMap<>();
		// ���ӳ��
		maps.put("����", 20);
		maps.put("����", 21);
		maps.put("����", 22);
		
		// ����key��ȡvalue
		System.out.println("-------����keyȡvalue--------");
		Object value1 = maps.get("����");
		System.out.println(value1); // 20
		
		
		// ����Map
		// Mapû��Ŷ������
		System.out.println("-----����������----");
		Set<String> sets = maps.keySet();
		Iterator<String> it = sets.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Object val = maps.get(key);
			System.out.println(key + "=" + val);
		}
		
		System.out.println("-----foreach������----");
		for (String key : sets) {
			System.out.println(key + "=" + maps.get(key));
		}
		
		
		
		

	}

}

package ����.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lesson03 {
	public static void main(String[] args) {
		HashMap<String, Integer> maps = new HashMap<>();
		maps.put("����", 20);
		maps.put("����", 21);
		maps.put("����", 22);
		
		// �õ�entry����
		Set<Map.Entry<String, Integer>> entrySets = maps.entrySet();
		maps.entrySet();
		
		// �õ�entry���ϵĵ�����
		Iterator<Entry<String,Integer>> it = entrySets.iterator();
		// ����������
		while (it.hasNext()) {
			// �õ�ÿ��entry
			Entry<String,Integer> en = it.next();
			String key = en.getKey();
			Integer val = en.getValue();
			System.out.println(key + "=" + val);
			
		}
		
		System.out.println("---------");
		
		// foreach����
		for (Entry<String, Integer> entry : entrySets) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		
	}

}

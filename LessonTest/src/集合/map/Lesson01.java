package ����.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson01 {

	public static void main(String[] args) {
		
		// map�е�Ԫ���������
		Map<String, Object> maps = new HashMap<String,Object>();
		maps.put("key1", "value1"); // key���ظ�����null�����key�ظ��򸲸�value�����ؾɵ�value
		maps.put("key2", "value2");
		maps.put("key3", "value3");
		maps.put("key4", "value4");
		maps.put("key5", "value5");
		System.out.println(maps); // {key1=value1, key2=value2, key5=value5, key3=value3, key4=value4}
		
		// ��ȡ����key
		Set<String> keys = maps.keySet();
		System.out.println(keys); // [key1, key2, key5, key3, key4]

		// ��ȡ����value
		Collection<Object> values = maps.values();
		System.out.println(values); // [value1, value2, value5, value3, value4]
		
		// ����key�Ƴ�
		System.out.println("-----һ����key�Ƴ�-----");
		maps.remove("key1");
		System.out.println(maps); // {key2=value2, key5=value5, key3=value3, key4=value4}
		
		// ��ȡ����
		System.out.println("-----��ȡ����------");
		System.out.println(maps.size()); // 4 int��
		
		// ���
		System.out.println("----���----");
		maps.clear();
		System.out.println(maps); // {}
		
		
		
	}

}

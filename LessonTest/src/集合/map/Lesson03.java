package 集合.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lesson03 {
	public static void main(String[] args) {
		HashMap<String, Integer> maps = new HashMap<>();
		maps.put("张三", 20);
		maps.put("李四", 21);
		maps.put("王五", 22);
		
		// 得到entry集合
		Set<Map.Entry<String, Integer>> entrySets = maps.entrySet();
		maps.entrySet();
		
		// 得到entry集合的迭代器
		Iterator<Entry<String,Integer>> it = entrySets.iterator();
		// 迭代器遍历
		while (it.hasNext()) {
			// 得到每个entry
			Entry<String,Integer> en = it.next();
			String key = en.getKey();
			Integer val = en.getValue();
			System.out.println(key + "=" + val);
			
		}
		
		System.out.println("---------");
		
		// foreach遍历
		for (Entry<String, Integer> entry : entrySets) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		
	}

}

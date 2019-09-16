package 集合.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Lesson02 {

	public static void main(String[] args) {
		// 声明映射
		HashMap<String, Object> maps = new HashMap<>();
		// 添加映射
		maps.put("张三", 20);
		maps.put("李四", 21);
		maps.put("王五", 22);
		
		// 根据key获取value
		System.out.println("-------根据key取value--------");
		Object value1 = maps.get("张三");
		System.out.println(value1); // 20
		
		
		// 遍历Map
		// Map没有哦迭代器
		System.out.println("-----迭代器遍历----");
		Set<String> sets = maps.keySet();
		Iterator<String> it = sets.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Object val = maps.get(key);
			System.out.println(key + "=" + val);
		}
		
		System.out.println("-----foreach器遍历----");
		for (String key : sets) {
			System.out.println(key + "=" + maps.get(key));
		}
		
		
		
		

	}

}

package 集合.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Lesson05 {

	public static void main(String[] args) {
		/**
		 * HashMap当中的元素是无序的
		 * LinkedHashMap 是有序的
		 */
		
		HashMap<String, Integer> maps1 = new HashMap<>();
		maps1.put("张三", 18);
		maps1.put("李四", 19);
		maps1.put("王五", 20);
		System.out.println(maps1);
		
		
		LinkedHashMap<String, Integer> maps2 = new LinkedHashMap<>();
		maps2.put("张三", 18);
		maps2.put("李四", 19);
		maps2.put("王五", 20);
		System.out.println(maps2);
		
		

	}

}

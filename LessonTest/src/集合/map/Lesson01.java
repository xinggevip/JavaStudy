package 集合.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson01 {

	public static void main(String[] args) {
		
		// map中的元素是无序的
		Map<String, Object> maps = new HashMap<String,Object>();
		maps.put("key1", "value1"); // key不重复返回null，如果key重复则覆盖value，返回旧的value
		maps.put("key2", "value2");
		maps.put("key3", "value3");
		maps.put("key4", "value4");
		maps.put("key5", "value5");
		System.out.println(maps); // {key1=value1, key2=value2, key5=value5, key3=value3, key4=value4}
		
		// 获取所有key
		Set<String> keys = maps.keySet();
		System.out.println(keys); // [key1, key2, key5, key3, key4]

		// 获取所有value
		Collection<Object> values = maps.values();
		System.out.println(values); // [value1, value2, value5, value3, value4]
		
		// 按照key移出
		System.out.println("-----一按照key移出-----");
		maps.remove("key1");
		System.out.println(maps); // {key2=value2, key5=value5, key3=value3, key4=value4}
		
		// 获取长度
		System.out.println("-----获取长度------");
		System.out.println(maps.size()); // 4 int型
		
		// 清空
		System.out.println("----清空----");
		maps.clear();
		System.out.println(maps); // {}
		
		
		
	}

}

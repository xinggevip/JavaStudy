package 集合.map;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson06 {

	public static void main(String[] args) {
		// 判断每个字符出现的次数
		
		Scanner sc = new Scanner(System.in);
		String str;
		char[] carr;
		HashMap<Character, Integer> maps = new HashMap<>();
		System.out.print("请输入字符串：");
		str = sc.nextLine();
		carr = str.toCharArray();
		
		for (char c : carr) {
			if (!maps.containsKey(c)) {
				// 如果映射的key中不存在该key，则把该key添加进映射
				maps.put(c, 1);
			}else {
				// 如果映射的key中已存在该key，则让该entry的value加1
				maps.put(c, maps.get(c) + 1);
			}
		}
		
		System.out.println("字符串出现的次数统计为：");
		System.out.println(maps);
		
		
		
		

	}

}

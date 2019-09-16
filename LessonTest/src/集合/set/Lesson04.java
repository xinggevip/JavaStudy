package 集合.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Lesson04 {

	public static void main(String[] args) {
		// 获取1-20之间得随机数
		// 获取十个
		// 不允许有重复
		
		/**
		 * 实现：
		 * 1.使用Rondom类，创建村冈生成结果集
		 * 2.创建生成结果得集合，HashSet
		 * 3.当HashSet.size大于10得时候，就不生成了
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

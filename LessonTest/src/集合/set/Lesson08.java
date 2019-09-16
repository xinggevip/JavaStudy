package 集合.set;

import java.util.Comparator;
import java.util.TreeSet;

class ComparLength implements Comparator<String>{

	// 第一个参数为正在添加的对象，第二个参数为集合的根对象
	@Override
	public int compare(String o1, String o2) {
		int len = o1.length() - o2.length();
		return len == 0 ? o1.compareTo(o2) : len; // 正数放右边，负数放左边，0不放，读取的时候从左到右
	}
	
}

public class Lesson08 {

	public static void main(String[] args) {
		
		TreeSet<String>	set1 = new TreeSet<>();
		set1.add("aaaaaa");
		set1.add("bsda");
		set1.add("ygggggg");
		set1.add("z");
		System.out.println(set1); // 默认按照字母顺序排序
		
		System.out.println("----------------");
		
		// 用自定义的比较器进行比较
		
		TreeSet<String>	set2 = new TreeSet<>(new ComparLength());
		set2.add("aaaaaa");
		set2.add("bsda");
		set2.add("ygggggg");
		set2.add("z");
		System.out.println(set2); // 按照自定义比较器进行比较，规则是长度比较
		
		

	}
	
	

}

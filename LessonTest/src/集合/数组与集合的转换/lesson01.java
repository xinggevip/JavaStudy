package 集合.数组与集合的转换;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson01 {

	public static void main(String[] args) {
		// 转换之后可以以面向对象的方式操作数组，除了不能进行添加和删除操作，其他操作都是可以的
		
		// 把数组转换成集合
		int arr[] = {10, 20, 30};
		List<int[]> list1 = Arrays.asList(arr);
//		list.add(10);	// 数组转的集合不能添加元素
		System.out.println(list1.size());	// 1
		
		// 在开发过程中一般不把基本数据类型数组转换成集合
		
		System.out.println("-------------------------");
		// 引用数据类型的数组才会转成集合
		
		Integer arr2[] = {5, 7, 9};
		List<Integer> list2 = Arrays.asList(arr2);
		System.out.println(list2);		// [5, 7, 9]
		
		// 集合转数组
		List<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		
		Object obj1 = list3.toArray();
		String str1[] = list3.toArray(new String[0]);	// 数组为静态开辟的空间，热锅不够，会自动增加
		System.out.println(Arrays.toString(str1));	// [a, b]


	}

}

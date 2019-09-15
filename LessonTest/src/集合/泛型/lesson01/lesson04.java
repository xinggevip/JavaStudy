package 集合.泛型.lesson01;

import java.util.ArrayList;
import java.util.List;

public class lesson04 {

	public static void main(String[] args) {
		// 泛型擦除
		List<String> list1 = new ArrayList<String>();
		list1.add("Tom");
		
		List list2 = list1;	// 会自动把泛型擦除
		list2.add(10);
		System.out.println(list2); // [Tom, 10]


	}

}

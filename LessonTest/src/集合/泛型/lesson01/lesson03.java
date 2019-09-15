package 集合.泛型.lesson01;

import java.util.ArrayList;
import java.util.List;

public class lesson03 {
	// 指定上限
	static void test1(List<? extends Number> list) {
		
	}
	
	// 指定下限
	static void test2(List<? super Number> list) {
		
	}

	public static void main(String[] args) {
		
		// 规定上限后只能传Number及Numbern的子类
		List<Integer> list = new ArrayList<>();
		test1(list);
		
		//  规定下限后只能传Number及Numbern的父类
		List<Object> list2 = new ArrayList<>();
		test2(list2);

	}

}

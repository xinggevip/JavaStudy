package 集合.泛型.lesson01;

import java.util.ArrayList;

public class lesson02 {
	
	// 通配符的使用
	static ArrayList<?> test1(ArrayList<?> list) {
		return list;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		test1(list); // ArrayList<String>
	}

}

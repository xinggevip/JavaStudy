package ����.����.lesson01;

import java.util.ArrayList;
import java.util.List;

public class lesson04 {

	public static void main(String[] args) {
		// ���Ͳ���
		List<String> list1 = new ArrayList<String>();
		list1.add("Tom");
		
		List list2 = list1;	// ���Զ��ѷ��Ͳ���
		list2.add(10);
		System.out.println(list2); // [Tom, 10]


	}

}

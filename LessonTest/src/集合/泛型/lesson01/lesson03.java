package ����.����.lesson01;

import java.util.ArrayList;
import java.util.List;

public class lesson03 {
	// ָ������
	static void test1(List<? extends Number> list) {
		
	}
	
	// ָ������
	static void test2(List<? super Number> list) {
		
	}

	public static void main(String[] args) {
		
		// �涨���޺�ֻ�ܴ�Number��Numbern������
		List<Integer> list = new ArrayList<>();
		test1(list);
		
		//  �涨���޺�ֻ�ܴ�Number��Numbern�ĸ���
		List<Object> list2 = new ArrayList<>();
		test2(list2);

	}

}

package ����.����.lesson01;

import java.util.ArrayList;

public class lesson02 {
	
	// ͨ�����ʹ��
	static ArrayList<?> test1(ArrayList<?> list) {
		return list;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		test1(list); // ArrayList<String>
	}

}

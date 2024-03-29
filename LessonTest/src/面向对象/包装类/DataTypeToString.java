package 面向对象.包装类;

import org.omg.CORBA.INTERNAL;

public class DataTypeToString {

	public static void main(String[] args) {
		
		// 包装类valueOf()缓存设计
		Integer n1 = new Integer(123);
		Integer n2 = new Integer(123);
		System.out.println(n1 == n2);// false比较两个值的地址
		
		Integer n3 = Integer.valueOf(123);
		Integer n4 = Integer.valueOf(123);
		System.out.println(n3 == n4);// true 
		
		Integer n5 = Integer.valueOf(223);
		Integer n6 = Integer.valueOf(223);
		System.out.println(n5 == n6);// false
		
		
	}

}

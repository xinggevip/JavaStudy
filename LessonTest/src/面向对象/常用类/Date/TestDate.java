package 面向对象.常用类.Date;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		// 1.直接new一个Date
		Date d1 = new Date();
		System.out.println(d1);// 获取当前的时间
		
		// 2.把毫秒转换成日期
		Long l1 = System.currentTimeMillis();
		Date d2 = new Date(l1);
		System.out.println(d2);
		
		// 3.中国日期风格
		String s1 = d2.toLocaleString();
		System.out.println(s1);
		
		// 4.把日期转换成毫秒
		System.out.println(d2.getTime());
		
		
		
		

	}

}

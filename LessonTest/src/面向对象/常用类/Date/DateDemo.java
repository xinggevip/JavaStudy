package 面向对象.常用类.Date;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParseException.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	static void test() throws ParseException {
		// 创建一个日期
		Date time = new Date();
		System.out.println(time); // Sun Sep 08 17:48:18 GMT+08:00 2019

		// 格式化日期
		DateFormat df1 = DateFormat.getInstance();
		String time1 = df1.format(time);
		System.out.println(time1); // 19-9-8 下午5:48

		// 格式化日期  等同于上面的写法
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		String time2 = df2.format(time);
		System.out.println(time2); // 19-9-8 下午5:48

		// 格式化日期
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		String time3 = df3.format(time);
		System.out.println(time3); // 2019年9月8日 下午05时48分18秒
		
		// 只获取时间
		DateFormat df4 = DateFormat.getTimeInstance();
		String time4 = df4.format(time);
		System.out.println(time4);
		
		// 把字符串转成日期
		DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		Date date2 = df5.parse(time1);
		System.out.println(date2);
		
		// 自定义格式
		SimpleDateFormat df6 = new SimpleDateFormat("yyyy年MM月dd");
		String time6 = df6.format(time);
		System.out.println(time6);
		
		// 自定义格式
		SimpleDateFormat df7 = new SimpleDateFormat();
		String pattern = "YYYY";
		df7.applyPattern(pattern);
		String time7 = df7.format(time);
		System.out.println(time7);
		
	}

	public static void main(String[] args) throws ParseException {
		test();
		
	}

}

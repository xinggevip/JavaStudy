package 面向对象.常用类.String;

import javax.print.attribute.standard.Chromaticity;

/**
 * 什么是字符串？
 * 把字符串联在一起
 * 
 * 字符串的分类
 * 可变字符串：定义完成之后可以被修改
 * 不可变字符串：定义完成之后不可以被修改
 * 	StringBuild
 * 	StringBuffer
 * 
 * 字符串本质其实是一个char数组
 * private final char value[];
 * 
 * 字符串的比较：
 * 1. == 比较两个内存地址是否相等
 * 2.使用equals 它实在Object 和 == 相同
 * 建议子类，自己去覆盖次方法，自己在内部类当中根据自己的需求去判断两个值是否相等
 * @author xingge
 *
 */

public class TestString {

	public static void main(String[] args) {
		// char c[] = {'a','b','c','d'};
		// System.out.println(c);
		
		String str1 = "ABC";// 不可修改，再次复制会创建新的对象
		String str2 = new String("ABC");
		if (str1 == str2) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		// String类覆盖了equals
		// 1.想去比较两个对象地址相不相等
		// 2.如果不相等，再去判断是否为String，是 逐个断每个字符是否相等
		if (str1.equals(str2)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}

}

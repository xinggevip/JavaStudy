package 面向对象.常用类.String;

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
 * @author xingge
 *
 */

public class TestString {

	public static void main(String[] args) {
		
		String str = "ABC";
		System.out.println(str.length());
	}

}

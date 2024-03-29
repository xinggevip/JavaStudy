package 面向对象.常用类.String;

import java.lang.reflect.Array;
import java.util.Arrays;

import 面向对象.内部类.局部内部类.Test;

/**
 * fileName.split(";");  // 分割成数组
 * name.startsWith("hello");  // 判断是否以指定字符开头
 * name.lastIndexOf('.');  // 获取指定字符最后出现的位置
 * name.substring(index); // 获取指定位置往后所有的字符，两个参数为获取指定位置之间的字符
 * str1.trim();  // 去掉收尾空格
 * str1.replace(" ", "") // 把指定字符替换成指定字符  实现去掉所有空格
 * @author xingge
 *
 */

public class StringDemo {
	public static void test() {
		// 获取以hello开头的文件名的后缀名
		String fileName = "abc.java;hello.myxq;hello.text.java;hello.class";
		// 分割成数组
		String[] strArr = fileName.split(";");
		System.out.println(Arrays.toString(strArr));
		for (String name : strArr) {
//			System.out.println(name);
			// 判断是不是以hello开头
			if (name.startsWith("hello")) {
				System.out.println(name);
				// 获取最后一个字符','的位置
				int index = name.lastIndexOf('.');
				// 获取最后一个点往后的所有字符
				String newName = name.substring(index);
				System.out.println(newName);
			}
		}
		
	}

	public static void main(String[] args) {
		test();
		// 去掉空格
		// 去掉首位空格
		// 去掉中间的空格
		String str1 = " Hello word ";
		System.out.println(str1.trim());
//		System.out.println(str1.trim().replace(" ", ""));
		System.out.println(str1.replace(" ", ""));
		

	}

}

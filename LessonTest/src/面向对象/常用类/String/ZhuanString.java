package 面向对象.常用类.String;

public class ZhuanString {

	public static void main(String[] args) {
		// char[] 转 String
		char[] cs = {'a','b','c','d'};
		String str1 = new String(cs);
		System.out.println(str1); // abcd
		
		// String 转 char[]
		char[] cs2 = str1.toCharArray();
		System.out.println(cs2); // abcd
		
		// 字符串常用方法
		// 根据下标找字符
		char cs3 = str1.charAt(0);
		System.out.println(cs3);
		// 根据字符串找下标,首次出现的位置
		int num1 = str1.indexOf("cd");
		System.out.println(num1);
		// 根据字符找下标,最后一次出现的位置
		int num2 = str1.lastIndexOf("d");
		System.out.println(num2);
		// 转大写
		System.out.println(str1.toUpperCase());
		// 转小写
		String str3 = "ABCDEF";
		System.out.println(str3.toLowerCase());
		// 不区分到小写比较
		
		String s1 = "ab";
		String s2 = "AB";
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}

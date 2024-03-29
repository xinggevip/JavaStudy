package 面向对象.常用类.String;

public class StringBuilderDemo {
	static void test() {
		
		// 这两句话都是一样的，16为默认字符长度，添加字符自动给扩容
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder(16);
		
		// 普通字符串转StringBuilder
		StringBuilder str3 = new StringBuilder("Hello");
		
		// StringBuilder 转普通字符串
		String str4 = str3.toString();
		
		// 添加字符串,可以添加任意类型
		str3.append(" world");
		System.out.println(str3); // Hello world
		
		// 删除指定位置的字符串
		str3.deleteCharAt(0);
		System.out.println(str3); // ello world
		
		// 删除指定范围的字符串
		str3.delete(0, 2);
		System.out.println(str3); // lo world
		
		// 字符串反转
		str3.reverse();
		System.out.println(str3); // dlrow ol
		
		
	}

	public static void main(String[] args) {
		test();

	}

}

package 面向对象.常用类.String;

/**
 * 常量 =》 方法区有一个常量池
 * 1.String str = "ABCD";
 *   使用String str = "ABCD";创建字符串
 *   要么创建一个对象，要么不创建
 *   会先到常量池中找一下，有没有存在该字符串常量
 *   如果已经有了，就直接使用，不会创建新的地址
 *   如果常量池中没有的话，就会再常量池中创建一个对象
 * 2.String str = new String("ABCD");
 *   至少创建一个对象
 * @author xingge
 *
 */

public class TestStringTwo {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "ABC";
		System.out.println(str1 == str2);

	}

}

package 面向对象.常用类.main方法;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
	// 点击运行时，JVM自动运行main方法
	public static void main(String[] args) {
		
		System.out.println(args.length);
		for (String string : args) {
			System.out.println(string);
		}
		System.out.println("--------------");
		System.out.println(Arrays.toString(args));
	}

}

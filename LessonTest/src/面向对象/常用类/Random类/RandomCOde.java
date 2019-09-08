package 面向对象.常用类.Random类;

import java.util.Random;

public class RandomCode {
	static  void CreatCode() {
		// 生成5位数验证码
		
		// 创建验证码字符串
		String sum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sum = sum + sum.toLowerCase();
		sum = sum + "0123456789";
		
		// 生成验证码
		StringBuilder code = new StringBuilder(5);
		for(int i = 0;i <= 5; i++) {
			// 生成0-sum长度中其中一个数
			int index = new Random().nextInt(sum.length());
			// 取一个数
			char c = sum.charAt(index);
			// 把数添加进字符串
			code.append(c);
		}
		System.out.println(code);
		
	}

	public static void main(String[] args) {
		CreatCode();

	}

}

package 面向对象.常用类.BigDecimal大精度类;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigDecimal {

	public static void main(String[] args) {
		// double folt 计算有误差
		System.out.println("0.09 + 0.01 = " + 0.09 + 0.01); // 0.09 + 0.01 = 0.090.01
		
		// BigDecimal 大十进制，参数传字符串才可以得到想要的结果  计算无误差
		BigDecimal num1 = new BigDecimal("0.09");
		BigDecimal num2 = new BigDecimal("0.01");
		System.out.println( num1.add(num2) ); // 0.10
		
		// BigInteger 大整形，可以计算超过Long的范围  可计算超大数据
		BigInteger num3 = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger num4  = BigInteger.valueOf(10);
		
		System.out.println(num3); // 9223372036854775807
		System.out.println(num3.add(num4)); // 9223372036854775817
		
		
		

	}

}

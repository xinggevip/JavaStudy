package 面向对象.包装类;import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		Integer num1 = new Integer(a);
		Integer num2 = Integer.valueOf(a);
		
		
		System.out.println(num1.TYPE);
		System.out.println(num2);// 10
		
		// 字符串转int
		String str1 = "123";
		Integer num3 = Integer.valueOf(str1);
		System.out.println(num3);//123
		// int转换为二进制
		System.err.println(Integer.toBinaryString(100));
		System.out.println();
		
		// str1.format() 格式化
		// SimpleDateFormat  日期
		
		// Calendar 
		// set
		// list  ArrayList
		// 泛型
		System.out.println(Calendar.getInstance());
		
		int arr[] = new int[10];
		for(int i = 0;i < arr.length;i++){
			arr[i] = i;
		}
		for(int e : arr){
			System.out.println(e);
		}
		
		
		

	}

}

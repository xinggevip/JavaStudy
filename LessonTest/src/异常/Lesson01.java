package 异常;

public class Lesson01 {

	public static void main(String[] args) {
		
		// 异常处理
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			// 获取异常信息参数
			System.out.println(e.getMessage()); // by zero
			// 获取异常类命和异常信息
			System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero
			// 获取异常类名，异常信息，异常出现的位置
			e.printStackTrace(); // java.lang.ArithmeticException: / by zero at 异常.Lesson01.main(Lesson01.java:9)
		}
		
		System.out.println("aaa");
		

	}

}

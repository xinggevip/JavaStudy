package 异常;
class Person {
	private int age;

	public void setAge(int age) throws Exception {
		if (age >= 0 && age <= 150) {
			this.age = age;
		}else {
			// 处理异常:
			// 1.输出错误
//			System.out.println("年龄非法");
			// 2.抛出运行时异常，停止运行
//			throw new RuntimeException("年龄非法");
			// 3.抛出编译时异常,编译时异常必须处理，否则要一致网上抛
			throw new Exception("年龄非法");
		}
		
	}
	
}

public class Lesson02 {

	public static void main(String[] args) {
		Person p1 = new Person();
		try {
			p1.setAge(-10);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

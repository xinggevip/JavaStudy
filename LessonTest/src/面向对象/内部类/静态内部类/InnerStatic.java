package 面向对象.内部类.静态内部类;

class OutterTwo{
	static String name = "OutterStr";
	int age = 10;
	static class Inner{
		static String color = "red";
		void test() {
			System.out.println(name);
			System.out.println(new OutterTwo().age);// 内部类访问外部类
			System.out.println(color);
		}
	}
}

public class InnerStatic {

	public static void main(String[] args) {
		// 创建对象
		OutterTwo.Inner in = new OutterTwo.Inner();
		in.test();
		System.out.println(OutterTwo.Inner.color);

	}

}

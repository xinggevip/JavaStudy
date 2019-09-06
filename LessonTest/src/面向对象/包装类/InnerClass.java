package 面向对象.包装类;

class Outter{// 外部类
	String name = "Hello";
	
	class Inner{// 内部类
		void test() {
			System.out.println(name);
			System.out.println(Outter.this.name);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner in = out.new Inner();
		in.test();
		System.out.println("ll");

	}

}

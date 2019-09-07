package 面向对象.内部类.实例内部类;

class Outter{// 外部类
	String name = "OutterStr";
	
	class Inner{// 内部类
		// 不能有静态成员
		String name = "InnerSTr";
		void test() {
			String name = "TestStr";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner in = out.new Inner();
		in.test();

	}

}

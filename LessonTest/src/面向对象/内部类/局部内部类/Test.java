package 面向对象.内部类.局部内部类;


class Outter{
	static String Name = "hh";
	int age = 10;
	//private final String name = "myxq";
	void myxq () {
		String name = "myxq";// 编译器会编译成上面那句注释
		class Inner{
			void test () {
				System.out.println(name);
			}
		}
		Inner in = new Inner();
		in.test();
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter ou = new Outter();
		ou.myxq();
		
	}

}

package �������.�ڲ���.ʵ���ڲ���;

class Outter{// �ⲿ��
	String name = "OutterStr";
	
	class Inner{// �ڲ���
		// �����о�̬��Ա
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

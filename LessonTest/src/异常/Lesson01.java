package �쳣;

public class Lesson01 {

	public static void main(String[] args) {
		
		// �쳣����
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			// ��ȡ�쳣��Ϣ����
			System.out.println(e.getMessage()); // by zero
			// ��ȡ�쳣�������쳣��Ϣ
			System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero
			// ��ȡ�쳣�������쳣��Ϣ���쳣���ֵ�λ��
			e.printStackTrace(); // java.lang.ArithmeticException: / by zero at �쳣.Lesson01.main(Lesson01.java:9)
		}
		
		System.out.println("aaa");
		

	}

}

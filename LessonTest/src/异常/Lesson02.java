package �쳣;
class Person {
	private int age;

	public void setAge(int age) throws Exception {
		if (age >= 0 && age <= 150) {
			this.age = age;
		}else {
			// �����쳣:
			// 1.�������
//			System.out.println("����Ƿ�");
			// 2.�׳�����ʱ�쳣��ֹͣ����
//			throw new RuntimeException("����Ƿ�");
			// 3.�׳�����ʱ�쳣,����ʱ�쳣���봦������Ҫһ��������
			throw new Exception("����Ƿ�");
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

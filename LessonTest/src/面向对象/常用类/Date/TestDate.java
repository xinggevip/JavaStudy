package �������.������.Date;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		// 1.ֱ��newһ��Date
		Date d1 = new Date();
		System.out.println(d1);// ��ȡ��ǰ��ʱ��
		
		// 2.�Ѻ���ת��������
		Long l1 = System.currentTimeMillis();
		Date d2 = new Date(l1);
		System.out.println(d2);
		
		// 3.�й����ڷ��
		String s1 = d2.toLocaleString();
		System.out.println(s1);
		
		// 4.������ת���ɺ���
		System.out.println(d2.getTime());
		
		
		
		

	}

}

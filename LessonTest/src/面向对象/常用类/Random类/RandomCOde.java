package �������.������.Random��;

import java.util.Random;

public class RandomCode {
	static  void CreatCode() {
		// ����5λ����֤��
		
		// ������֤���ַ���
		String sum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sum = sum + sum.toLowerCase();
		sum = sum + "0123456789";
		
		// ������֤��
		StringBuilder code = new StringBuilder(5);
		for(int i = 0;i <= 5; i++) {
			// ����0-sum����������һ����
			int index = new Random().nextInt(sum.length());
			// ȡһ����
			char c = sum.charAt(index);
			// ������ӽ��ַ���
			code.append(c);
		}
		System.out.println(code);
		
	}

	public static void main(String[] args) {
		CreatCode();

	}

}

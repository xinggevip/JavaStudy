package �������.������.String;

public class ZhuanString {

	public static void main(String[] args) {
		// char[] ת String
		char[] cs = {'a','b','c','d'};
		String str1 = new String(cs);
		System.out.println(str1); // abcd
		
		// String ת char[]
		char[] cs2 = str1.toCharArray();
		System.out.println(cs2); // abcd
		
		// �ַ������÷���
		// �����±����ַ�
		char cs3 = str1.charAt(0);
		System.out.println(cs3);
		// �����ַ������±�,�״γ��ֵ�λ��
		int num1 = str1.indexOf("cd");
		System.out.println(num1);
		// �����ַ����±�,���һ�γ��ֵ�λ��
		int num2 = str1.lastIndexOf("d");
		System.out.println(num2);
		// ת��д
		System.out.println(str1.toUpperCase());
		// תСд
		String str3 = "ABCDEF";
		System.out.println(str3.toLowerCase());
		// �����ֵ�Сд�Ƚ�
		
		String s1 = "ab";
		String s2 = "AB";
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}

package �������.������.String;

/**
 * ���� =�� ��������һ��������
 * 1.String str = "ABCD";
 *   ʹ��String str = "ABCD";�����ַ���
 *   Ҫô����һ������Ҫô������
 *   ���ȵ�����������һ�£���û�д��ڸ��ַ�������
 *   ����Ѿ����ˣ���ֱ��ʹ�ã����ᴴ���µĵ�ַ
 *   �����������û�еĻ����ͻ��ٳ������д���һ������
 * 2.String str = new String("ABCD");
 *   ���ٴ���һ������
 * @author xingge
 *
 */

public class TestStringTwo {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "ABC";
		System.out.println(str1 == str2);

	}

}

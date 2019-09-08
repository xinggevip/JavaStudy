package �������.������.String;

import java.lang.reflect.Array;
import java.util.Arrays;

import �������.�ڲ���.�ֲ��ڲ���.Test;

/**
 * fileName.split(";");  // �ָ������
 * name.startsWith("hello");  // �ж��Ƿ���ָ���ַ���ͷ
 * name.lastIndexOf('.');  // ��ȡָ���ַ������ֵ�λ��
 * name.substring(index); // ��ȡָ��λ���������е��ַ�����������Ϊ��ȡָ��λ��֮����ַ�
 * str1.trim();  // ȥ����β�ո�
 * str1.replace(" ", "") // ��ָ���ַ��滻��ָ���ַ�  ʵ��ȥ�����пո�
 * @author xingge
 *
 */

public class StringDemo {
	public static void test() {
		// ��ȡ��hello��ͷ���ļ����ĺ�׺��
		String fileName = "abc.java;hello.myxq;hello.text.java;hello.class";
		// �ָ������
		String[] strArr = fileName.split(";");
		System.out.println(Arrays.toString(strArr));
		for (String name : strArr) {
//			System.out.println(name);
			// �ж��ǲ�����hello��ͷ
			if (name.startsWith("hello")) {
				System.out.println(name);
				// ��ȡ���һ���ַ�','��λ��
				int index = name.lastIndexOf('.');
				// ��ȡ���һ��������������ַ�
				String newName = name.substring(index);
				System.out.println(newName);
			}
		}
		
	}

	public static void main(String[] args) {
		test();
		// ȥ���ո�
		// ȥ����λ�ո�
		// ȥ���м�Ŀո�
		String str1 = " Hello word ";
		System.out.println(str1.trim());
//		System.out.println(str1.trim().replace(" ", ""));
		System.out.println(str1.replace(" ", ""));
		

	}

}

package ����.�����뼯�ϵ�ת��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson01 {

	public static void main(String[] args) {
		// ת��֮��������������ķ�ʽ�������飬���˲��ܽ�����Ӻ�ɾ�������������������ǿ��Ե�
		
		// ������ת���ɼ���
		int arr[] = {10, 20, 30};
		List<int[]> list1 = Arrays.asList(arr);
//		list.add(10);	// ����ת�ļ��ϲ������Ԫ��
		System.out.println(list1.size());	// 1
		
		// �ڿ���������һ�㲻�ѻ���������������ת���ɼ���
		
		System.out.println("-------------------------");
		// �����������͵�����Ż�ת�ɼ���
		
		Integer arr2[] = {5, 7, 9};
		List<Integer> list2 = Arrays.asList(arr2);
		System.out.println(list2);		// [5, 7, 9]
		
		// ����ת����
		List<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		
		Object obj1 = list3.toArray();
		String str1[] = list3.toArray(new String[0]);	// ����Ϊ��̬���ٵĿռ䣬�ȹ����������Զ�����
		System.out.println(Arrays.toString(str1));	// [a, b]


	}

}

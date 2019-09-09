package ����.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList {
	static void listDemo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		// ��ָ��λ�ò���ֵ
		list.add(list.size(),"d");
		System.out.println(list); // [a, b, c, d]
		
		System.out.println("-------------");
		
		// ����
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i)); // a b c d
		}
		
		System.out.println("-------------");
		
		for(Object item:list) {
			System.out.println(item); // a b c d
		}
		
		// ɾ��
		list.remove(0);
		System.out.println(list); // [b, c, d]
		
		// ɾ��
		list.remove("b");
		System.out.println(list); // [c, d]
		
		
	}

	static void listDemo2(){
		// 1.����
		// 2.ȡ��Ԫ��
		// 3.��ѯ����
		// 4.�Ƴ�Ԫ��
		
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			if (object.equals("a")) {
				it.remove();
			}
			
		}
		System.out.println(list); // [b, c, d]

	}

	static void listDemo3() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		// Iteratorֻ��ɾ������
		// ListIterator�и��ḻ�ķ���
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			if (object.equals("b")) {
				it.add("2");
			}
			
		}
		System.out.println(list); // [a, b, 2, c, d]
		
		System.out.println("-----------------");
		
		
		// ���ϵ���
		while (it.hasPrevious()) {
			// ��ȡ�α�ָ��λ��
			System.out.println("previousIndex = " + it.previousIndex());
			String object = (String) it.previous();
			System.out.println(object);
			
		}
		
		
	}

	static void listDemo4() {
		
		System.out.println("����ȥ��------------");
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
		// 1.�ȴ���һ���յļ���
		// 2.��������
		// 3.ȡ������
		// 4.�鿴�¼���ʱ����ȡ���ļ���
		
		ArrayList newList = new ArrayList();
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if (!newList.contains(object)) {
				newList.add(object);
			}
			
		}
		System.out.println(newList);
		
	}
	public static void main(String[] args) {
		
		// ��ɾ�ò����
		listDemo1();
		
		// ������ѯ����ɾ��
		listDemo2();
		
		//list���еĵ�����ListIterator
		listDemo3();
		
		// ArrayListȥ��
		
		listDemo4();
		
	}

}

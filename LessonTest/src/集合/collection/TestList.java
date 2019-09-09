package 集合.collection;

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
		
		// 在指定位置插入值
		list.add(list.size(),"d");
		System.out.println(list); // [a, b, c, d]
		
		System.out.println("-------------");
		
		// 遍历
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i)); // a b c d
		}
		
		System.out.println("-------------");
		
		for(Object item:list) {
			System.out.println(item); // a b c d
		}
		
		// 删除
		list.remove(0);
		System.out.println(list); // [b, c, d]
		
		// 删除
		list.remove("b");
		System.out.println(list); // [c, d]
		
		
	}

	static void listDemo2(){
		// 1.遍历
		// 2.取出元素
		// 3.查询条件
		// 4.移出元素
		
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
		
		// Iterator只有删除方法
		// ListIterator有更丰富的方法
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			if (object.equals("b")) {
				it.add("2");
			}
			
		}
		System.out.println(list); // [a, b, 2, c, d]
		
		System.out.println("-----------------");
		
		
		// 向上迭代
		while (it.hasPrevious()) {
			// 获取游标指向位置
			System.out.println("previousIndex = " + it.previousIndex());
			String object = (String) it.previous();
			System.out.println(object);
			
		}
		
		
	}

	static void listDemo4() {
		
		System.out.println("数组去重------------");
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
		// 1.先创建一个空的集合
		// 2.遍历集合
		// 3.取出集合
		// 4.查看新集合时候含有取出的集合
		
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
		
		// 增删该查遍历
		listDemo1();
		
		// 遍历查询条件删除
		listDemo2();
		
		//list特有的迭代器ListIterator
		listDemo3();
		
		// ArrayList去重
		
		listDemo4();
		
	}

}

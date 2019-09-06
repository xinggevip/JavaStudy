package com.gaoxing.lesson01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// HashSet
		/**
		 * 如你的需求是要一个能快速访问的Set，那么就要用HashSet,
		 * 如果你要一个排序Set，那么你应该用TreeSet,
		 * 如果你要记录下插入时的顺序时，你应该使用LinedHashSet。
		 */
		HashSet dset = new HashSet();

		dset.add(1);

		dset.add(1);

		dset.add(6);

		dset.add(7);

		dset.add(2);

		Iterator iterator = dset.iterator();
		System.out.print("HashSet快速访问：");

		while(iterator.hasNext())
		{
	 
			System.out.print(iterator.next() + " ");
		}
		
		
		
		System.out.println("");

		TreeSet tree = new TreeSet();
		 
		tree.add(28);
		 
		tree.add(58);
		 
		tree.add(38);
		 
		tree.add(18);
		 
		Iterator iterator1 = tree.iterator();
		 
		System.out.print("TreeSet快速排序: ");
		 
		while (iterator1.hasNext()) {
		 
		System.out.print(iterator1.next() + " ");
		 
		}
		
		
		
		
		System.out.println("");
		
		
		LinkedHashSet dset1 = new LinkedHashSet();
		 
		dset1.add(7);
		 
		dset1.add(6);
		 
		dset1.add(8);
		 
		dset1.add(10);
		 
		dset1.add(9);
		 
		Iterator iterator11 = dset1.iterator();
		
		System.out.print("LinedHashSet:");
		 
		while (iterator11.hasNext()) {
		 
		System.out.print(iterator11.next() + " ");
		 
		}

		
		
		
		
		
		
		

	}
}

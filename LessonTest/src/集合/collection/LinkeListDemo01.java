package ¼¯ºÏ.collection;

import java.util.LinkedList;

class Stake{
	LinkedList list;
	public Stake() {
		list = new LinkedList();
	}
	
	public void add(Object e){
		list.add(e);
	}
	
	public void pop(){
		list.removeLast();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
}

public class LinkeListDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stake s = new Stake();
		
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);

	}

}

package com.gaoxing.lesson01;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("Tom", 31);
		Student s1 = new Student("xiaoming", 18);
		t1.show();
		t1.setName("Tom��ʦ");
		t1.show();
		
		s1.show();
		s1.setName("xiaomingѧ��");
		s1.show();
	}

}

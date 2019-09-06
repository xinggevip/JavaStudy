package com.gaoxing.lessontest;

class Person {
	void bus () {
		System.out.println("谈生意");
	}
}
class suMan extends Person{
	void fly () {
		System.out.println("飞走了");
	}
	
	void bus () {
		System.out.println("普通人谈生意");
	}
}

public class TestBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new suMan();
		p1.bus();
		System.out.println("看到有人跳楼");
		suMan s1 = (suMan)p1;
		s1.fly();
	}

}

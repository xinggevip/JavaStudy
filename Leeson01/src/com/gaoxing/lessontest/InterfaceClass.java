package com.gaoxing.lessontest;

interface Ludi {
	void wolk();
}

interface Niao {
	void fly();
}

interface Liang extends Ludi, Niao {

}

class Animal {
	String name;
	String color;
}

class Cat extends Animal implements Ludi, Niao {
	public void wolk() {
		System.out.println("×ßÃ¨²½");
	}

	public void fly() {
		System.out.println("·É");
	}

	void eat() {
		System.out.println("³ÔÃ¨Á¸");
	}
}

public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ludi l1 = new Cat();
		l1.wolk();
		Niao n1 = (Niao) l1;
		n1.fly();
		Cat c1 = (Cat) n1;
		c1.eat();
	}

}

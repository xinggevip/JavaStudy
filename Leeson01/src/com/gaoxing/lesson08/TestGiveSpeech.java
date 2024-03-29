package com.gaoxing.lesson08;

abstract class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	int age;
	abstract void giveSpeech();
	
}

class Chinese extends Person{
	
	public Chinese(String name) {
		super(name);
	}

	void giveSpeech() {
		System.out.println(name + "演讲的主题是<<" + "人类命运共同体" + ">>");
	}
	
}

class American extends Person{
	
	public American(String name) {
		super(name);
	}

	void giveSpeech() {
		System.out.println(name + "演讲的主题是<<" + "为什么美国是伟大的?" + ">>");
	}
	
}

class Meeting{
	String name = "联合国大会";
	public Meeting(String name) {
		this.name = name;
		System.out.println(this.name + "会议开始!");
	}
	
	void speech(Person p) {
		if (p instanceof Chinese) {
			p.giveSpeech();
		}else if (p instanceof American) {
			p.giveSpeech();
		}
	}
	
	
}

public class TestGiveSpeech {

	public static void main(String[] args) {
		Meeting m1 = new Meeting("联合国大会之中美贸易战");
		Chinese c1 = new Chinese("成龙");
		m1.speech(c1);
		American a1 = new American("川普");
		m1.speech(a1);

	}

}

package com.gaoxing.lessontest;


class Dog{
	String name;
}

class PersonTest{
	String name;
	int age;
	Dog pet;
	void show () {
		
	}
	
}

public class ZuheGuanxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTest p1 = new PersonTest();
		Dog d1 = new Dog();
		d1.name = "wc";
		p1.name = "Tom";
		p1.pet = d1;
		System.out.println(p1.pet.name);

	}

}

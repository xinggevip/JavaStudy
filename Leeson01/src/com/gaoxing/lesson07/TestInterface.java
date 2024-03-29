package com.gaoxing.lesson07;

interface Motor {
	void run();
}

interface Steamer {
	void sailing();
}

interface Plane {
	void fly();
}

class SuCar implements Motor,Steamer,Plane {
	String name = "海陆空三栖超级交通工具";

	public void fly() {
		System.out.println(name + " 起飞了");
	}

	public void sailing() {
		System.out.println(name + " 航海了");
	}

	public void run() {
		System.out.println(name + " 开动了");
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		SuCar c1 = new SuCar();
		c1.run();
		c1.sailing();
		c1.fly();
	}

}

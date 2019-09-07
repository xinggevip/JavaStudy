package com.gaoxing.lesson06;

// 定义接口
// 实现接口
// 创建对象

interface Usb {
	void work();
}

class Mp3 implements Usb {
	String name = "漫步者mp3";

	public void work() {
		System.out.println(name + "播放了");
	}
}

class Disk implements Usb {
	String name = "东芝硬盘";

	public void work() {
		System.out.println(name + "读写正常");
	}
}

class U_Disk implements Usb {
	String name = "金士顿U盘";

	public void work() {
		System.out.println(name + "读写正常");
	}
}

public class Testinterface {
	public static void main(String[] args) {
		Usb m1 = new Mp3();
		m1.work();
		Usb d1 = new Disk();
		d1.work();
		Usb u1 = new U_Disk();
		u1.work();

	}
}

package com.gaoxing.lesson06;

// ����ӿ�
// ʵ�ֽӿ�
// ��������

interface Usb {
	void work();
}

class Mp3 implements Usb {
	String name = "������mp3";

	public void work() {
		System.out.println(name + "������");
	}
}

class Disk implements Usb {
	String name = "��֥Ӳ��";

	public void work() {
		System.out.println(name + "��д����");
	}
}

class U_Disk implements Usb {
	String name = "��ʿ��U��";

	public void work() {
		System.out.println(name + "��д����");
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

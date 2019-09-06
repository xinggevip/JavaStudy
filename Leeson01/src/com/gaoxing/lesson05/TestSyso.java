package com.gaoxing.lesson05;

public class TestSyso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SysoFather hb1 = new SysoHeiBai();
		hb1.name = "黑白打印机1号";
		hb1.price = 200;
		SysoFather cai1 = new SysoCai();
		cai1.name = "彩色打印机1号";
		cai1.price = 999;
		
		Employee npc1 = new Employee("朱一旦");
		npc1.sysoOut(hb1);
		Employee npc2 = new Employee("朱一旦的外甥");
		npc2.sysoOut(cai1);
		npc1.huan(hb1);
		npc2.huan(cai1);
	}

}

package com.gaoxing.lesson03;

public class TestSyso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SysoHeiBai hb1 = new SysoHeiBai();
		hb1.name = "�ڰ״�ӡ��1��";
		hb1.price = 200;
		hb1.show("�ڰײ���");
		hb1.reSrcOfHeibai();
		SysoCai cai1 = new SysoCai();
		cai1.name = "��ɫ��ӡ��1��";
		cai1.price = 999;
		cai1.show("��ɫ����");
		cai1.reSrcOfCai();
	}

}

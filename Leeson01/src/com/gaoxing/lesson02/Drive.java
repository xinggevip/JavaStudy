package com.gaoxing.lesson02;

public class Drive {
	String name;
	public Drive(String name){
		this.name = name;
		System.out.println(name + "���ڼ�ʻ�γ�");
	}
	public Drive(String name,int a){
		this.name = name;
		System.out.println(name + "���ڼ�ʻ�ͳ�");
	}
	public Drive(String name,boolean b){
		this.name = name;
		System.out.println(name + "���ڼ�ʻ����");
	}
}

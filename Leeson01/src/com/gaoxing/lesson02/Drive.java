package com.gaoxing.lesson02;

public class Drive {
	String name;
	public Drive(String name){
		this.name = name;
		System.out.println(name + "正在驾驶轿车");
	}
	public Drive(String name,int a){
		this.name = name;
		System.out.println(name + "正在驾驶客车");
	}
	public Drive(String name,boolean b){
		this.name = name;
		System.out.println(name + "正在驾驶货车");
	}
}

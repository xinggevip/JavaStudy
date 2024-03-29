package com.gaoxing.lessontest;
/**
 * 定义抽象类后，子类必须实现父类的抽象方法
 * @author xingge
 *
 */
abstract class Graph {
	abstract double MianJi();
}

class Circle extends Graph{
	double r;
	Circle(double r) {
		this.r = r;
	}
	double MianJi(){
		return 3.14 * r *r;
	}
	double MianJi(double r) {
		return 3.14 * r;
	}
	
}

class Jx extends Graph{
	double x;
	double y;
	Jx(double x,double y){
		this.x = x;
		this.y = y;
	}
	double MianJi() {
		return x* y;
	}
	double MianJi(double x,double y) {
		return x * y;
	}
}

public class MianJi {

	public static void main(String[] args) {
		Graph c1 = new Circle(12.5);
		Graph j1 = new Jx(12, 5);
		System.out.println(c1.MianJi());
		System.out.println(j1.MianJi());
		
	}

}

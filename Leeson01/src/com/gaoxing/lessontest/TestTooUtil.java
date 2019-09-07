package com.gaoxing.lessontest;

// 单例设计模式
class TooUtil {

	//	1.必须要在该类中创建一个对象
	private static TooUtil instance = new TooUtil();
	//	2.私有化自己的构造器，防止别人通过构造器创建新的对象
	private TooUtil() {}
	//	3.给外界提供一个方法，能够获取自己已经创建好的对象
	public static TooUtil getInstance() {
		return instance;
	}
	static void work() {
		System.out.println("工作");
	}

}

public class TestTooUtil{
	public static void main(String[] args) {
		TooUtil.work();
		TooUtil.getInstance().work();
		TooUtil t1 = TooUtil.getInstance();
		TooUtil t2 = TooUtil.getInstance();
		System.out.println(t1 == t2);// t1,t2都来自同一个地址,始终是一个对象
	}
}

package com.gaoxing.lessontest;

// �������ģʽ
class TooUtil {

	//	1.����Ҫ�ڸ����д���һ������
	private static TooUtil instance = new TooUtil();
	//	2.˽�л��Լ��Ĺ���������ֹ����ͨ�������������µĶ���
	private TooUtil() {}
	//	3.������ṩһ���������ܹ���ȡ�Լ��Ѿ������õĶ���
	public static TooUtil getInstance() {
		return instance;
	}
	static void work() {
		System.out.println("����");
	}

}

public class TestTooUtil{
	public static void main(String[] args) {
		TooUtil.work();
		TooUtil.getInstance().work();
		TooUtil t1 = TooUtil.getInstance();
		TooUtil t2 = TooUtil.getInstance();
		System.out.println(t1 == t2);// t1,t2������ͬһ����ַ,ʼ����һ������
	}
}

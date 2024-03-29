package 面向对象.常用类.Math类;

/**
 * 有关数学的操作在手册搜Math
 * @author xingge
 *
 */

public class TestMath {

	public static void main(String[] args) {
		// 最大值
		int res = Math.max(10, 20);
		System.out.println(res);
		
		// 随机数 Math.random()  范围是[0,1)
		// 0 - 100
		int sj = (int)(Math.random()*100 + 1);
		System.out.println(sj);
		
		// 开根
		double kg = Math.sqrt(81);
		System.out.println(kg);

	}

}

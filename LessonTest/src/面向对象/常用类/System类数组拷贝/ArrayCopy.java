package 面向对象.常用类.System类数组拷贝;

import java.util.Arrays;
/**
 * src - 原数组
 * srcPos - 原数组的开始下标
 * dest - 目标数组
 * destPos - 目标数据中的开始下标
 * length - 要复制的数组元素数量
 * @author xingge
 *
 */

public class ArrayCopy {

	public static void main(String[] args) {
		int[] src = {1, 2, 3, 4, 5, 6 };
		int[] dest = new int[10];
		System.arraycopy(src, 2, dest, 2, 4);
		System.out.println(Arrays.toString(src)); // [1, 2, 3, 4, 5, 6]
		System.out.println(Arrays.toString(dest)); // [0, 0, 3, 4, 5, 6, 0, 0, 0, 0]
	}

}

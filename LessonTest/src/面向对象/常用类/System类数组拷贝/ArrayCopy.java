package �������.������.System�����鿽��;

import java.util.Arrays;
/**
 * src - ԭ����
 * srcPos - ԭ����Ŀ�ʼ�±�
 * dest - Ŀ������
 * destPos - Ŀ�������еĿ�ʼ�±�
 * length - Ҫ���Ƶ�����Ԫ������
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

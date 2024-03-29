package 面向对象.常用类.Random类;

import java.rmi.server.UID;
import java.util.Random;
import java.util.UUID;

public class TestRandom {
	static void test() {
		Random res = new Random();
		int num = res.nextInt();
		System.out.println(num);
		
		System.out.println(res.nextDouble());
		System.out.println(res.nextBoolean());
		
		System.out.println("------------------");
		
		// 相同的种子，生成的随机数是一样的
		Random r = new Random(10);
		System.out.println(r.nextInt());
		
		// 随机生成34 - 179之间的数
		//                      生成0-145之间的数,不包括145
		int num2 = new Random().nextInt(145) + 34;
		System.out.println(num2);
		
		System.out.println("------------------");
		// 生成UUID
		// UUID：通用唯一标识符
		// 当前的时间，跟当前电脑的网卡，生成一段字符
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		
		
 		
	}

	public static void main(String[] args) {
		test();

	}

}

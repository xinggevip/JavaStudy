package 面向对象.常用类.System类计算代码耗时;

public class SystemMethods {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("我被java虚拟机回收了");
	}

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		System.out.println("代码总耗时：" + time3);
		
		// 运行垃圾回收，java虚拟机自己有的垃圾回收机制，这句话可以立即执行垃圾回收一般不会主动调用该方法
		SystemMethods s = new SystemMethods();
		new SystemMethods();// 地址没有被引用就会变成垃圾
		System.gc();
		
		// 终止当前正在运行的java虚拟机
		System.exit(0);// 0 为正常退出，-1为以尝退出
		System.out.println("---------");

	}

}

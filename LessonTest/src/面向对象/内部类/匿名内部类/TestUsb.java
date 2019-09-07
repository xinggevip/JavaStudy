package 面向对象.内部类.匿名内部类;

interface IUsbable{
	void swapData();
}

class MainBoard{
	void use(IUsbable device) {
		device.swapData();
	}
}

class Mouse implements IUsbable{

	public void swapData() {
		System.out.println("移动鼠标");
	}
	
}

class Key implements IUsbable{


	public void swapData() {
		System.out.println("输入数据");
	}
	
}

public class TestUsb {

	public static void main(String[] args) {

		MainBoard zhuban = new MainBoard();
		IUsbable m = new Mouse();
		IUsbable k = new Key();
		zhuban.use(m);
		zhuban.use(k);
		zhuban.use(new IUsbable() {
			// 匿名内部类
			public void swapData() {
				System.out.println("设备工作");
			}
		});
		

	}

}

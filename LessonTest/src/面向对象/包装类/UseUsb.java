package 面向对象.包装类;

// 面向接口

// 定义主板
// 定义鼠标
// 定义键盘

// 定义接口

interface IUsb {
	void swapData();
}


class MainBoard {
	void Use(IUsb device) {
		device.swapData();
	}
}

class Mouse implements IUsb{
	public void swapData() {
		System.out.println("鼠标工作");
	}
}

class Key implements IUsb{
	public void swapData() {
		System.out.println("键盘工作");
	}
}

public class UseUsb {

	public static void main(String[] args) {
		MainBoard zb = new MainBoard();
		IUsb m = new Mouse();
		IUsb k = new Key();
		zb.Use(m);
		zb.Use(k);

	}

}

package �������.�ڲ���.�����ڲ���;

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
		System.out.println("�ƶ����");
	}
	
}

class Key implements IUsbable{


	public void swapData() {
		System.out.println("��������");
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
			// �����ڲ���
			public void swapData() {
				System.out.println("�豸����");
			}
		});
		

	}

}

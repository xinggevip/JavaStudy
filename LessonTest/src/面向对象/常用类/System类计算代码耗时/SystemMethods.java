package �������.������.System���������ʱ;

public class SystemMethods {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("�ұ�java�����������");
	}

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		System.out.println("�����ܺ�ʱ��" + time3);
		
		// �����������գ�java������Լ��е��������ջ��ƣ���仰��������ִ����������һ�㲻���������ø÷���
		SystemMethods s = new SystemMethods();
		new SystemMethods();// ��ַû�б����þͻ�������
		System.gc();
		
		// ��ֹ��ǰ�������е�java�����
		System.exit(0);// 0 Ϊ�����˳���-1Ϊ�Գ��˳�
		System.out.println("---------");

	}

}

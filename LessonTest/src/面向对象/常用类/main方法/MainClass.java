package �������.������.main����;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
	// �������ʱ��JVM�Զ�����main����
	public static void main(String[] args) {
		
		System.out.println(args.length);
		for (String string : args) {
			System.out.println(string);
		}
		System.out.println("--------------");
		System.out.println(Arrays.toString(args));
	}

}

package 面向对象.常用类.String;

/**
 * normalString(); // 167
 * stringBuffer(); // 1       方法前多了一个synchronized  加锁  更加安全
 * stringBuilder(); // 0      没有synchronized 效率更高
 * 
 * 字符串拼接性能
 * 
 * @author xingge
 *
 */



public class StringBuilderBufferDemo {
	
	static void normalString() {
		long oldTime = System.currentTimeMillis();
		
		String str = "";
		for(int i = 0;i < 10000;i++){
			str += i;
		}
		
		long newTime = System.currentTimeMillis();
		long resTime = newTime - oldTime;
		System.out.println(resTime);
		
	}
	
	static void stringBuilder() {
		long oldTime = System.currentTimeMillis();
		
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			str.append(i);
		}
		
		
		long newTime = System.currentTimeMillis();
		long resTime = newTime - oldTime;
		System.out.println(resTime);
	}
	
	static void stringBuffer() {
		long oldTime = System.currentTimeMillis();
		
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			str.append(i);
		}
		
		
		long newTime = System.currentTimeMillis();
		long resTime = newTime - oldTime;
		System.out.println(resTime);
	}

	public static void main(String[] args) {
		
		normalString(); // 167
		stringBuffer(); // 1
		stringBuilder(); // 0
		
		
		
		
	}

}

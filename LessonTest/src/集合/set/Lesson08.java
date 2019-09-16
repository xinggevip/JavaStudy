package ����.set;

import java.util.Comparator;
import java.util.TreeSet;

class ComparLength implements Comparator<String>{

	// ��һ������Ϊ������ӵĶ��󣬵ڶ�������Ϊ���ϵĸ�����
	@Override
	public int compare(String o1, String o2) {
		int len = o1.length() - o2.length();
		return len == 0 ? o1.compareTo(o2) : len; // �������ұߣ���������ߣ�0���ţ���ȡ��ʱ�������
	}
	
}

public class Lesson08 {

	public static void main(String[] args) {
		
		TreeSet<String>	set1 = new TreeSet<>();
		set1.add("aaaaaa");
		set1.add("bsda");
		set1.add("ygggggg");
		set1.add("z");
		System.out.println(set1); // Ĭ�ϰ�����ĸ˳������
		
		System.out.println("----------------");
		
		// ���Զ���ıȽ������бȽ�
		
		TreeSet<String>	set2 = new TreeSet<>(new ComparLength());
		set2.add("aaaaaa");
		set2.add("bsda");
		set2.add("ygggggg");
		set2.add("z");
		System.out.println(set2); // �����Զ���Ƚ������бȽϣ������ǳ��ȱȽ�
		
		

	}
	
	

}

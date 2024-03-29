package 面向对象.枚举;

import org.w3c.dom.NamedNodeMap;

// 定义星期类
// 定义学生类
//class WeekDay{
//	public static final WeekDay MONDAY = new WeekDay();
//	public static final WeekDay TUESDAY = new WeekDay();
//	public static final WeekDay WEDNESDAY = new WeekDay();
//	public static final WeekDay THURSDAY = new WeekDay();
//	public static final WeekDay FRIDAY = new WeekDay();
//	public static final WeekDay SATURDAY = new WeekDay();
//	public static final WeekDay SUNDAY = new WeekDay();
//}

enum WeekDay{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

enum Sex{
	NAN,NV;
}

class Student{
	private WeekDay restDay;

	public WeekDay getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay restDay) {
		this.restDay = restDay;
	}
	
}


public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRestDay(WeekDay.SUNDAY);
		if (s.getRestDay() == WeekDay.SATURDAY || s.getRestDay() == WeekDay.SUNDAY) {
			System.out.println("放假了");
		}else {
			System.out.println("没有放假");
		}
		
		System.out.println(Sex.NAN);// 默认调用.name()
		System.out.println(Sex.NAN.name());
		// ordinal()返回位置
		System.out.println(Sex.NAN.ordinal());
		System.out.println(Sex.NV.ordinal());
		
		// 配合switch
		switch (Sex.NAN) {
		case NAN:
			System.out.println("是NAN");
			break;
		case NV:
			System.out.println("是NV");
			break;

		default:
			break;
		}
		
		System.out.println("--------------");
		// 遍历枚举
		Sex[] allres = Sex.values();
		for (Sex sex : allres) {
			System.out.println(sex);
		}
		
		System.out.println(allres[0]);
		
		// 字符串转枚举   报错为解决  https://blog.csdn.net/u010667011/article/details/83545813   https://blog.csdn.net/tplina/article/details/87984558
//		Sex S = Sex.valueOf("BOYYYYY");
//		System.out.println(S);
		

	}

}

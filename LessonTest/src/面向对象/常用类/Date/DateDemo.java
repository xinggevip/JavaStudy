package �������.������.Date;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParseException.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	static void test() throws ParseException {
		// ����һ������
		Date time = new Date();
		System.out.println(time); // Sun Sep 08 17:48:18 GMT+08:00 2019

		// ��ʽ������
		DateFormat df1 = DateFormat.getInstance();
		String time1 = df1.format(time);
		System.out.println(time1); // 19-9-8 ����5:48

		// ��ʽ������  ��ͬ�������д��
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		String time2 = df2.format(time);
		System.out.println(time2); // 19-9-8 ����5:48

		// ��ʽ������
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		String time3 = df3.format(time);
		System.out.println(time3); // 2019��9��8�� ����05ʱ48��18��
		
		// ֻ��ȡʱ��
		DateFormat df4 = DateFormat.getTimeInstance();
		String time4 = df4.format(time);
		System.out.println(time4);
		
		// ���ַ���ת������
		DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		Date date2 = df5.parse(time1);
		System.out.println(date2);
		
		// �Զ����ʽ
		SimpleDateFormat df6 = new SimpleDateFormat("yyyy��MM��dd");
		String time6 = df6.format(time);
		System.out.println(time6);
		
		// �Զ����ʽ
		SimpleDateFormat df7 = new SimpleDateFormat();
		String pattern = "YYYY";
		df7.applyPattern(pattern);
		String time7 = df7.format(time);
		System.out.println(time7);
		
	}

	public static void main(String[] args) throws ParseException {
		test();
		
	}

}

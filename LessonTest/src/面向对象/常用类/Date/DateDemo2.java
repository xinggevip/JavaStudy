package �������.������.Date;

import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��װ������
 * @author xingge
 *
 */

class DateUtil{
	private DateUtil() {};
	private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	// ����ת�ַ���  ��������
	public static String dateToString(Date dade,String pattern) {
		
		if(pattern == null || pattern.equals("")) {
			pattern = DEFAULT_PATTERN;
		}
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern(pattern);
		String res = df.format(dade);
		
		return res;
	}
	
	// ����ת�ַ���  һ������
	public static String dateToString(Date date) {
		return dateToString(date, "");
	}
	
	// �ַ���ת����  ��������
	public static Date StringToDate(String str,String pattern) throws ParseException {
		
		if(pattern == null || pattern.equals("")) {
			pattern = DEFAULT_PATTERN;
		}
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern(pattern);
		Date date = df.parse(str);
			
		return date;
	}
	
	// �ַ���ת����  һ������
	public static Date StringToDate(String str) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern(DEFAULT_PATTERN);
		Date date = df.parse(str);
			
		return date;
	}
	
	
}

public class DateDemo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String reString = DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss");
		System.out.println(reString);
		
		String reString2 = DateUtil.dateToString(new Date(), "");
		System.out.println(reString2);
		
		String reString3 = DateUtil.dateToString(new Date());
		System.out.println(reString3);
		
		Date date = DateUtil.StringToDate("2019-09-08 22:00:17", "yyyy-MM-dd HH:mm:ss");
		System.out.println(date);
	}

}

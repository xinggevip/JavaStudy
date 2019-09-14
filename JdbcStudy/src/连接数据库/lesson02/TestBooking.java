package �������ݿ�.lesson02;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

class BookingUtil {
	private BookingUtil(String name){};
	// ��
	static boolean add(){
		System.out.println("ִ�����Ӳ���");
		return true;
	}
	
	// ɾ
	
	// ��
	
	// ��
	
	
	
}

class UseUtil{
	
	private UseUtil(){};
	static void add() {
		BookingUtil.add();
	}
	
	
	
}


public class TestBooking {

	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mysql://localhost:3306/booking?characterEncoding=utf8&useSSL=true";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			
			con = DriverManager.getConnection(url, user, password);
			
			Statement st = con.createStatement();
			
			ResultSet res = st.executeQuery("select `user`.`name` AS `name`,`pricetable`.`type` AS `type`,`pricetable`.`date` AS `date`,`pricetable`.`info` AS `info`,`pricetable`.`price` AS `price`,`classify`.`inout` AS `inout`,`user`.`sex` AS `sex`,`user`.`age` AS `age`,`user`.`mobilphone` AS `mobilphone` from ((`classify` join `pricetable` on((`pricetable`.`type` = `classify`.`type`))) join `user` on((`pricetable`.`userid` = `user`.`id`)))");			
			
			while(res.next()){
				
				// ��ȡ����
				String name = res.getString("name");
				
				// ��ȡ��������
				String type = res.getString("type");
				
				// ��ȡ��������
				java.sql.Timestamp timeStamp = res.getTimestamp("date");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
				String date = sdf.format(timeStamp);
				
				// ��ȡ��������
				String info = res.getString("info");
				
				// ��ȡ���ѽ��
				BigDecimal price = res.getBigDecimal("price");
				
				// ��ȡ�Ա�
				String sex = res.getString("sex");
				
				// ��ȡ����
				int age = res.getInt("age");

				// ��ȡ�ֻ���
				int phone = res.getInt("mobilphone");
				

				System.out.println(name + "\t" + type + "\t" + date + "\t" + info + "\t" + price + "\t" + sex + "\t" + age + "\t" + phone);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

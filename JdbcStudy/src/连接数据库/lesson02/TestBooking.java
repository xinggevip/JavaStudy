package 连接数据库.lesson02;

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
	// 增
	static boolean add(){
		System.out.println("执行增加操作");
		return true;
	}
	
	// 删
	
	// 查
	
	// 改
	
	
	
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
				
				// 获取姓名
				String name = res.getString("name");
				
				// 获取消费类型
				String type = res.getString("type");
				
				// 获取消费日期
				java.sql.Timestamp timeStamp = res.getTimestamp("date");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
				String date = sdf.format(timeStamp);
				
				// 获取消费详情
				String info = res.getString("info");
				
				// 获取消费金额
				BigDecimal price = res.getBigDecimal("price");
				
				// 获取性别
				String sex = res.getString("sex");
				
				// 获取年龄
				int age = res.getInt("age");

				// 获取手机号
				int phone = res.getInt("mobilphone");
				

				System.out.println(name + "\t" + type + "\t" + date + "\t" + info + "\t" + price + "\t" + sex + "\t" + age + "\t" + phone);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

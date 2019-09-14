package 连接数据库.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	//声明Connection对象
    Connection con;
    //驱动程序名
    String driver = "com.mysql.jdbc.Driver";
    //URL指向要访问的数据库名mydata
    String url = "jdbc:mysql://localhost:3306/jdbctest";
    //MySQL配置时的用户名
    String user = "root";
    //MySQL配置时的密码
    String password = "root";

	public static void main(String[] args) {
		
		//声明Connection对象
	    Connection con;
	    //驱动程序名
	    String driver = "com.mysql.jdbc.Driver";
	    //URL指向要访问的数据库名mydata
	    String url = "jdbc:mysql://localhost:3306/jdbctest";
	    //MySQL配置时的用户名
	    String user = "root";
	    //MySQL配置时的密码
	    String password = "root";
		
		
		// 1.加载驱动
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.连接数据库
			con = DriverManager.getConnection(url, user, password);
			// 3.创建statement
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery("select * from emp");
			while(res.next()){
				String name = res.getString("ename");
				System.out.println(name);
			}
			
			
			
			res.close(); // 关闭查询结果
			st.close(); // 关闭查询实例对象
			con.close();  // 关闭Connection对象
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		// 4.执行sql

	}

}

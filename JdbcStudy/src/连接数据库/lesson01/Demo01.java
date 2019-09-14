package 连接数据库.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Demo01 {

	public static void main(String[] args) {
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.连接数据库
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
			// 3.创建statement
			Statement st = conn.createStatement();
			
			// 4.执行sql语句
			ResultSet rs = st.executeQuery("select * from emp");
//			System.out.println(rs);
			// 4.1.1执行查询
			while(rs.next()){
				int i = rs.getInt("empno");
				System.out.println(i);
			}
			
			
			
			//增删改统称为更新
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

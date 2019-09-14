package 连接数据库.lesson03;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * 数据库辅助类
 * @author xingge
 *
 */

public class DBHelper {
	// 配置数据库用户名
	private static String user = "root";
	// 配置数据库密码
	private static String password = "root";
	// 数据库地址
	private static String url = "jdbc:mysql://localhost:3306/jdbctest?characterEncoding=utf8&useSSL=true";
	// 数据库连接对象
	private static  Connection conn;
	
	// 私有化构造器
	public DBHelper() {};
	
	public static Connection getConn() {
		
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// getConnection方法连接数据库
			conn = (Connection) DriverManager.getConnection(url, user, password);	
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}finally{
			System.out.println("数据库连接成功");
		}
		
		
		return conn;
	}
	
	
	

}

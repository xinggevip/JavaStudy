package 连接数据库.lesson03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class VisitMySQL {
	// 私有化构造器
	private VisitMySQL() {};
	// 存储连接对象
	private static Connection conn;
	// 存储statement
	private static Statement stt;
	// 存储结果集
	private static ResultSet res;
	
	private static Scanner sc = new Scanner(System.in);
	
	// 查
	public static void query() {
		conn = DBHelper.getConn();
		try {
			stt = conn.createStatement();
			res = stt.executeQuery("select * from emp");
			while(res.next()) {
				System.out.println(res.getString("ename"));
			}
		} catch (SQLException e) {
			System.out.println("statement创建失败");
			e.printStackTrace();
		}finally {
			System.out.println("sql执行完毕");
		}
	
	}
	
	// 增
	public static void add() {
		conn = DBHelper.getConn();
		
		
		try {
			
			int num;
			System.out.println("请输入员工编号：");
			num = sc.nextInt();
			String name;
			System.out.println("请输入员工姓名：");
			name = sc.nextLine();
			String sql = "INSERT INTO `emp` VALUES ("+ num +", "+ name +")";
			stt = conn.createStatement();
			stt.executeUpdate(sql);	
			
		} catch (SQLException e) {
			System.out.println("statement创建失败");
			e.printStackTrace();
		}
		
		
	}
	

}

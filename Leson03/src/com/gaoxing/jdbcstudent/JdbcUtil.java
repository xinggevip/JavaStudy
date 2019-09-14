package com.gaoxing.jdbcstudent;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

import com.mysql.jdbc.Driver;

public class JdbcUtil implements IjdbcBle {
	Connection con;
	String url = "jdbc:mysql://localhost:3306/booking?characterEncoding=utf8&useSSL=true";
	String user = "root";
	String password = "root";
	Statement st;
	
	
	public JdbcUtil(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 数据库操作

	@Override
	public  boolean add() {
		// 数据库增加学生
		Scanner sc = new Scanner(System.in);
		
		String name = null,sex = null,ban = null;
		int age = 0,id = 0;
		
		for(int i = 0;i < 5;i++){
			if (i == 0) {
				System.out.println("请输入学生姓名：");
				name = sc.nextLine();
			}else if (i == 1) {
				System.out.println("请输入学生性别：");
				sex = sc.nextLine();
			}else if (i == 2) {
				System.out.println("请输入学生年龄：");
				age = sc.nextInt();
			}else if (i == 3) {
				System.out.println("请输入学生班级：");
				ban = sc.nextLine();
				ban = sc.nextLine();
			}else if (i == 4) {
				System.out.println("请输入学生学号：");
				id = sc.nextInt();
			}
		}
		
		
//		String sql = "INSERT INTO `student` VALUES ("+ id + "," + name + "," + sex + "," + age + "," +  ban + ")";
		
			try {
				ResultSet res = st.executeQuery("select * from student");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updata() {
		// TODO Auto-generated method stub
		return false;
	}

}

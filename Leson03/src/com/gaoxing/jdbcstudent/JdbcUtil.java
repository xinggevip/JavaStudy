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
	
	// ���ݿ����

	@Override
	public  boolean add() {
		// ���ݿ�����ѧ��
		Scanner sc = new Scanner(System.in);
		
		String name = null,sex = null,ban = null;
		int age = 0,id = 0;
		
		for(int i = 0;i < 5;i++){
			if (i == 0) {
				System.out.println("������ѧ��������");
				name = sc.nextLine();
			}else if (i == 1) {
				System.out.println("������ѧ���Ա�");
				sex = sc.nextLine();
			}else if (i == 2) {
				System.out.println("������ѧ�����䣺");
				age = sc.nextInt();
			}else if (i == 3) {
				System.out.println("������ѧ���༶��");
				ban = sc.nextLine();
				ban = sc.nextLine();
			}else if (i == 4) {
				System.out.println("������ѧ��ѧ�ţ�");
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

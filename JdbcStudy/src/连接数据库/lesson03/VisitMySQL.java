package �������ݿ�.lesson03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class VisitMySQL {
	// ˽�л�������
	private VisitMySQL() {};
	// �洢���Ӷ���
	private static Connection conn;
	// �洢statement
	private static Statement stt;
	// �洢�����
	private static ResultSet res;
	
	private static Scanner sc = new Scanner(System.in);
	
	// ��
	public static void query() {
		conn = DBHelper.getConn();
		try {
			stt = conn.createStatement();
			res = stt.executeQuery("select * from emp");
			while(res.next()) {
				System.out.println(res.getString("ename"));
			}
		} catch (SQLException e) {
			System.out.println("statement����ʧ��");
			e.printStackTrace();
		}finally {
			System.out.println("sqlִ�����");
		}
	
	}
	
	// ��
	public static void add() {
		conn = DBHelper.getConn();
		
		
		try {
			
			int num;
			System.out.println("������Ա����ţ�");
			num = sc.nextInt();
			String name;
			System.out.println("������Ա��������");
			name = sc.nextLine();
			String sql = "INSERT INTO `emp` VALUES ("+ num +", "+ name +")";
			stt = conn.createStatement();
			stt.executeUpdate(sql);	
			
		} catch (SQLException e) {
			System.out.println("statement����ʧ��");
			e.printStackTrace();
		}
		
		
	}
	

}

package �������ݿ�.lesson03;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * ���ݿ⸨����
 * @author xingge
 *
 */

public class DBHelper {
	// �������ݿ��û���
	private static String user = "root";
	// �������ݿ�����
	private static String password = "root";
	// ���ݿ��ַ
	private static String url = "jdbc:mysql://localhost:3306/jdbctest?characterEncoding=utf8&useSSL=true";
	// ���ݿ����Ӷ���
	private static  Connection conn;
	
	// ˽�л�������
	public DBHelper() {};
	
	public static Connection getConn() {
		
		try {
			// ��������
			Class.forName("com.mysql.jdbc.Driver");
			// getConnection�����������ݿ�
			conn = (Connection) DriverManager.getConnection(url, user, password);	
		} catch (ClassNotFoundException e) {
			System.out.println("��������ʧ��");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
		}finally{
			System.out.println("���ݿ����ӳɹ�");
		}
		
		
		return conn;
	}
	
	
	

}

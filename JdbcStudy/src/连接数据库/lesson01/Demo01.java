package �������ݿ�.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Demo01 {

	public static void main(String[] args) {
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.�������ݿ�
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
			// 3.����statement
			Statement st = conn.createStatement();
			
			// 4.ִ��sql���
			ResultSet rs = st.executeQuery("select * from emp");
//			System.out.println(rs);
			// 4.1.1ִ�в�ѯ
			while(rs.next()){
				int i = rs.getInt("empno");
				System.out.println(i);
			}
			
			
			
			//��ɾ��ͳ��Ϊ����
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package �������ݿ�.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	//����Connection����
    Connection con;
    //����������
    String driver = "com.mysql.jdbc.Driver";
    //URLָ��Ҫ���ʵ����ݿ���mydata
    String url = "jdbc:mysql://localhost:3306/jdbctest";
    //MySQL����ʱ���û���
    String user = "root";
    //MySQL����ʱ������
    String password = "root";

	public static void main(String[] args) {
		
		//����Connection����
	    Connection con;
	    //����������
	    String driver = "com.mysql.jdbc.Driver";
	    //URLָ��Ҫ���ʵ����ݿ���mydata
	    String url = "jdbc:mysql://localhost:3306/jdbctest";
	    //MySQL����ʱ���û���
	    String user = "root";
	    //MySQL����ʱ������
	    String password = "root";
		
		
		// 1.��������
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.�������ݿ�
			con = DriverManager.getConnection(url, user, password);
			// 3.����statement
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery("select * from emp");
			while(res.next()){
				String name = res.getString("ename");
				System.out.println(name);
			}
			
			
			
			res.close(); // �رղ�ѯ���
			st.close(); // �رղ�ѯʵ������
			con.close();  // �ر�Connection����
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		// 4.ִ��sql

	}

}

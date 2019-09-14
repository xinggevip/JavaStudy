package 连接数据库.lesson03;

public class Test {

	public static void main(String[] args) {
		// 测试来连接数据库，发挥一个连接对象connection
		DBHelper.getConn();
		// 查询姓名
		VisitMySQL.query();
		// 增
		VisitMySQL.add();

	}

}

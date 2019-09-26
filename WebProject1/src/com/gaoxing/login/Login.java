package com.gaoxing.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.gaoxing.domain.User;
import com.gaoxing.jdbc.util.JdbcUtil;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * 1.获取请求参数
	 * 2.使用dbutils连接数据库
	 * 3.检查用户名与密码是否正确
	 * 4.成功则返回用户所有信息
	 * 5.失败则给一个错误提示
	 */
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.获取请求参数
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		System.out.println("username = " + username + "\tpwd = " + pwd);
		
		// 2.使用dbutils连接数据库
		QueryRunner qr = JdbcUtil.getQueryRunner();
		String sql = "select * from user where name = ? and pwd = ?";
		User u = null;
		try {
			u = qr.query(sql, new BeanHandler<User>(User.class),username,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (u != null) {
			response.getWriter().write("login success");
		}else {
			response.getWriter().write("login fail");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

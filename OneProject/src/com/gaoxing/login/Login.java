package com.gaoxing.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
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

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

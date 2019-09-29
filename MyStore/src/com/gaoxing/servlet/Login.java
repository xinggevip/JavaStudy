package com.gaoxing.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.gaoxing.domain.User;
import com.gaoxing.jdbc.util.JdbcUtil;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 设置请求编码，响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1.接收参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + password);
		// 2.查询数据库中是否有此用户
		QueryRunner qr = JdbcUtil.getQueryRunner();
		String sql = "select * from user where username=? and password=?";
		User u = null;
		try {
			u = qr.query(sql, new BeanHandler<User>(User.class), username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 查到了
		if (u != null) {
			response.getWriter().write("登录成功！3秒后跳转到首页...");
			response.setHeader("refresh", "3;url=/MyStore/index.html");
		}else {
			response.getWriter().write("登录失败！3秒后跳转到登陆页面...");
			response.setHeader("refresh", "3;url=/MyStore/login.html");
		}

	}

}

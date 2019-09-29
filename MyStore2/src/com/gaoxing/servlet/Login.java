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
		
		// ����������룬��Ӧ����
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1.���ղ���
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + password);
		// 2.��ѯ���ݿ����Ƿ��д��û�
		QueryRunner qr = JdbcUtil.getQueryRunner();
		String sql = "select * from user where username=? and password=?";
		User u = null;
		try {
			u = qr.query(sql, new BeanHandler<User>(User.class), username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �鵽��
		if (u != null) {
			response.getWriter().write("��¼�ɹ���3�����ת����ҳ...");
			response.setHeader("refresh", "3;url=/MyStore/index.html");
		}else {
			response.getWriter().write("��¼ʧ�ܣ�3�����ת����½ҳ��...");
			response.setHeader("refresh", "3;url=/MyStore/login.html");
		}

	}

}

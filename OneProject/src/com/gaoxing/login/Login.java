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
	 * 1.��ȡ�������
	 * 2.ʹ��dbutils�������ݿ�
	 * 3.����û����������Ƿ���ȷ
	 * 4.�ɹ��򷵻��û�������Ϣ
	 * 5.ʧ�����һ��������ʾ
	 */
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.��ȡ�������
		
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

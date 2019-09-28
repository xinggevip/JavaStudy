package com.gaoxing.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����ת��
		// 1.��ȡת���� ��ַ�����ᷢ���仯
		RequestDispatcher disp = request.getRequestDispatcher("/Servlet2");
		// servlet1�첻�����£�������ת����������������servlet2��
		disp.forward(request, response);
	}

}

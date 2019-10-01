package com.gaoxing.test;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String desPath = null;
		// ��ȡ��ǰ������ֽ���
		Class clazz = this.getClass();
		try {
			Method method = clazz.getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			// �ж���û���������
			// ����о͵���
			if (method != null) {
				desPath = (String)method.invoke(this, request, response);
				// ת��
				request.getRequestDispatcher(desPath).forward(request, response);
			}else {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

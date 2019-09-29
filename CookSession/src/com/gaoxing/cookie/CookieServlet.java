package com.gaoxing.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.����cookie
		Cookie cookie = new Cookie("key", "value");
		/**
		 * Ĭ�����cookie�ǻỰ�����
		 * ����������ر������Ϊһ�λỰ
		 * ��������ó־û�ʱ�䣬cookie��洢��������ڴ��У�������رգ�cookie��ʧ
		 */
		// 2.���ظ�response
		response.addCookie(cookie);
	}

}

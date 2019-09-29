package com.gaoxing.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet3")
public class CookieServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ����cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			// ȡ��ÿһ��cookie
			for (Cookie cookie : cookies) {
				// �ж������Ƿ����Լ���
				String name = cookie.getName();
				if (name.equals("key")) {
					response.getWriter().write("key = " + cookie.getValue());
				}
				
			}
		}
	}

}

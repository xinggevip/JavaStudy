package com.gaoxing.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet2")
public class CookieServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ɾ��cookie
		Cookie cookie = new Cookie("key", "value"); // ��ͬkey����
		// ����cookieЯ��·��
		cookie.setPath("/CookSession"); // ��ͬ·��
		cookie.setMaxAge(0);
	}

}

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
		// 1.创建cookie
		Cookie cookie = new Cookie("key", "value");
		/**
		 * 默认情况cookie是会话级别的
		 * 打开浏览器，关闭浏览器为一次会话
		 * 如果不设置持久化时间，cookie会存储再浏览器内存中，浏览器关闭，cookie消失
		 */
		// 2.返回给response
		response.addCookie(cookie);
	}

}

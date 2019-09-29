package com.gaoxing.cookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LasetServlet")
public class LasetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取上次登录时间
		
		// 1.获取当前日期
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
		String format = sdf.format(date);
		// 2.把日期写进cookie
		Cookie cookie = new Cookie("lastTime", format);
		// 3.响应给浏览器
		response.addCookie(cookie);
		
		String lastTime = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie2 : cookies) {
				if (cookie2.getName().equals("lastTime")) {
					lastTime = cookie2.getValue();
				}
			}
		}
		
		
		// 设置请求编码，响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		if (lastTime != null) {
			response.getWriter().write("上一次登录的时间为：" + lastTime);
		}else {
			response.getWriter().write("第一次登录");
		}
		
		
		
	}

}

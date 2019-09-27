package com.gaoxing.response;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responseservlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应头，响应行，相应体
		// 设置状态码
		response.setStatus(301);
		System.out.println("service----------");
		
		// 添加响应头
		response.addHeader("name", "gaoxing");
		response.addIntHeader("age", 10);
		response.addDateHeader("my-Date", new Date().getTime());
		
		// 设置响应头  能修改自己添加的也能修改默认的
		response.setHeader("name", "Mr Gao");
		response.addIntHeader("age", 22);
		
		// 301重定向
		// 通过设置响应头
//		response.setHeader("location", "/WebProject2/reloca");
		// 通过封装的方法
//		response.sendRedirect("/WebProject2/reloca");
		// 定时刷新重定向 隔3秒再重定向
//		response.setHeader("refresh", "3;url=/WebProject2/reloca");
		response.setHeader("refresh", "3;url=https://www.baidu.com");
		
		
		
		
	}

}

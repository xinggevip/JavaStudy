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
		// 请求转发
		// 1.获取转发器 地址栏不会发生变化
		RequestDispatcher disp = request.getRequestDispatcher("/Servlet2");
		// servlet1办不了这事，于是用转发器把这俩参数给servlet2了
		disp.forward(request, response);
	}

}

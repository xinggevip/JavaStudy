package com.gaoxing.reques;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;


@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("requesservlet-------------");
		/****************************请求头**************************/ 
		// 1.1获取请求方法 get post 默认是get
		String method = request.getMethod();
		System.out.println(method);
		
		// 1.获取所有请求头名称
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			String header = request.getHeader(string);
			System.out.println(string + " = " + header);
		}
		// 2.获取指定的头信息
		
		// 打印所有的请求内容
		
		/****************************请求行**************************/ 
		// 1.2获取请求URL URI
		StringBuffer requestURL = request.getRequestURL();
		String requestURI = request.getRequestURI();
		System.out.println(requestURL); // http://localhost:8080/WebProject3/RequestServlet
		System.out.println(requestURI); // /WebProject3/RequestServlet
		// 1.3获取get请求参数 ？后的内容
		String queryString = request.getQueryString();
		System.out.println(queryString); // name=fff&age=ggg
		// 1.4获取当前应用名称
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		/****************************请求体**************************/ 
		// 1.获取一个值
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		// 2.获取多个值
		String[] loves = request.getParameterValues("love");
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(sex);
		System.out.println(Arrays.toString(loves));
		System.out.println();
		// 3.获取所有请求参数名称
		Map<String, String[]> parameterMap = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + Arrays.toString(entry.getValue()));
		}
		
		
	}

}

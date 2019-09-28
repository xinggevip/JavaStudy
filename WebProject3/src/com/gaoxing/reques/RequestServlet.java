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
		/****************************����ͷ**************************/ 
		// 1.1��ȡ���󷽷� get post Ĭ����get
		String method = request.getMethod();
		System.out.println(method);
		
		// 1.��ȡ��������ͷ����
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			String header = request.getHeader(string);
			System.out.println(string + " = " + header);
		}
		// 2.��ȡָ����ͷ��Ϣ
		
		// ��ӡ���е���������
		
		/****************************������**************************/ 
		// 1.2��ȡ����URL URI
		StringBuffer requestURL = request.getRequestURL();
		String requestURI = request.getRequestURI();
		System.out.println(requestURL); // http://localhost:8080/WebProject3/RequestServlet
		System.out.println(requestURI); // /WebProject3/RequestServlet
		// 1.3��ȡget������� ���������
		String queryString = request.getQueryString();
		System.out.println(queryString); // name=fff&age=ggg
		// 1.4��ȡ��ǰӦ������
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		/****************************������**************************/ 
		// 1.��ȡһ��ֵ
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		// 2.��ȡ���ֵ
		String[] loves = request.getParameterValues("love");
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(sex);
		System.out.println(Arrays.toString(loves));
		System.out.println();
		// 3.��ȡ���������������
		Map<String, String[]> parameterMap = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + Arrays.toString(entry.getValue()));
		}
		
		
	}

}

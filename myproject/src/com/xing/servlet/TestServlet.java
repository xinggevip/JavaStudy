package com.xing.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class TestServlet implements Servlet{

	// servlet���ٵ�ʱ�򴥷����������رյ�ʱ��
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("�������ر���");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	// init����ֻ�ڴ��������ִ��һ��
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init...");
		
		// config ���Ի�ȡxml������Ϣ
		// ��ȡservlet����
		String name = config.getServletName();
		System.out.println(name);
		// ��ȡ��ʼ������web.xml
		String value = config.getInitParameter("mingzi");
		System.out.println(value);
		// ��ȡservletContext
		ServletContext sc = config.getServletContext();
	}

	// ����һ�����󣬴���һ��service����
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		HttpServletResponse res = (HttpServletResponse)arg1;
		
		res.setContentType("text/html");//�������ͣ�����Ϊjavascript�����html����
		res.setCharacterEncoding("utf-8");//���ݱ��룬��ֹ������������
		res.getWriter().write("�������");
		res.getWriter().write("Hellow Servlet");
		
	}

}

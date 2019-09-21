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

	// servlet销毁的时候触发，服务器关闭的时候
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("服务器关闭了");
		
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

	// init方法只在创建对象后执行一次
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init...");
		
		// config 可以获取xml配置信息
		// 获取servlet名称
		String name = config.getServletName();
		System.out.println(name);
		// 获取初始化参数web.xml
		String value = config.getInitParameter("mingzi");
		System.out.println(value);
		// 获取servletContext
		ServletContext sc = config.getServletContext();
	}

	// 接收一次请求，触发一次service方法
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		HttpServletResponse res = (HttpServletResponse)arg1;
		
		res.setContentType("text/html");//内容类型，解析为javascript代码或html代码
		res.setCharacterEncoding("utf-8");//内容编码，防止出现中文乱码
		res.getWriter().write("你的内容");
		res.getWriter().write("Hellow Servlet");
		
	}

}

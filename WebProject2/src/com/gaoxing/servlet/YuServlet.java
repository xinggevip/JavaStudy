package com.gaoxing.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.fastinfoset.CommonResourceBundle;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

/**
 * Servlet implementation class YuServlet
 */
@WebServlet("/yuservlet")
public class YuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ServletContext sc = config.getServletContext();
		sc.setInitParameter("lk", "gaoxing");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		sc.getInitParameter("lk"); // gaoxing 根据key获取value
		
	}

}

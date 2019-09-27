package com.gaoxing.servlet;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		super.init(config);
		System.out.println(sc);
		System.out.println("init-----------");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		System.out.println(sc);
		System.out.println("service-------------");
//		String value = sc.getInitParameter("lk");
//		System.out.println(value);
		// 获取绝对路径 sc.getRealPath
		// 当前项目的根路径// F:\GitSpace\JavaStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\WebProject2\
		// 把字符串与一个根路径合并得出新地址
		String realPath1 = sc.getRealPath("a.txt");
		String realPath2 = sc.getRealPath("WEB-INF/b.txt");
		System.out.println(realPath1); // F:\GitSpace\JavaStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\WebProject2\a.txt
		System.out.println(realPath2); // F:\GitSpace\JavaStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\WebProject2\WEB-INF\b.txt
		// 获取字节码目录，加载文件后获取文件路径  获取resource目录中的文件路径
		String realPath3 = MyServlet.class.getClassLoader().getResource("c.txt").getPath();
		System.out.println(realPath3);
		
		String realPath4 = MyServlet.class.getClassLoader().getResource("d.txt").getPath();
		System.out.println(realPath4);
		
		String realPath5 = MyServlet.class.getClassLoader().getResource("com/gaoxing/servlet/e.txt").getPath();
		System.out.println(realPath5);
		// 获取libraries
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

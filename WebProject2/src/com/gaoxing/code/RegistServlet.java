package com.gaoxing.code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收请求参数
		String code = request.getParameter("code");
		System.out.println(code);
		
		// tomcat7接收参数默认编码是ISO8859-1，9为utf-8
		/*
		byte[] bytes = code.getBytes("ISO8859-1");
		code = new String(bytes,"UTF-8");
		System.out.println(code);
		*/
		
		//取出一开始存放 的word
		String word = (String)this.getServletContext().getAttribute("checkCode");
		
		
		//设置字符集
		response.setContentType("text/html;charset=UTF-8");
		
		//两个做对比
		if(code.equals(word)) {
			response.getWriter().write("注册 成功 ");
		}else {
			response.getWriter().write("验证码错误  ");
			response.setHeader("refresh","3;url=/WebProject2/index.html");
		}
		
	}

}

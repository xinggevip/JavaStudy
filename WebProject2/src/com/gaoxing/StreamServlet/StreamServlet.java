package com.gaoxing.StreamServlet;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/streamservlet")
public class StreamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@SuppressWarnings("resource")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 读取字符
		
		// 加载一个文件
		// 一定使用绝对路径
		String path = this.getServletContext().getRealPath("a.txt");
		System.out.println(path); // F:\GitSpace\JavaStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\WebProject2\a.txt
		
		// 加载文件字节码
		FileInputStream in = new FileInputStream(path);
		System.out.println(in); // java.io.FileInputStream@3dff3ba4
		
		// 读取文件
		// 读一个字节码  返回ASCII码
		System.out.println(in.read()); // 65
		System.out.println(in.read()); // 66
		System.out.println(in.read()); // 67
		System.out.println(in.read()); // 68
		// 没有字符可读返回-1
		System.out.println(in.read()); // -1
		
		// 关闭文件
		in.close();
	}

}

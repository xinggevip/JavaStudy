package com.gaoxing.downservlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.BASE64Encoder;

@WebServlet("/downservlet")
public class DownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 下载文件
		
		/**********************1.接收请求参数************************/
		// 接收参数
		String name = request.getParameter("filename");
		System.out.println(name);
		
		/**********************2.对接收的参数进行编码处理************************/
		// tomcat7默认编码是ISO8859-1，9默认是utf-8
		/*
		// 获取参数，默认会对参数进行编码 ISO8859-1
		// 把接收的中文转成二进制位
		byte[] bytes = name.getBytes("ISO8859-1");
		// 再使用utf-8进行编码
		name = new String(bytes,"UTF-8");
		System.out.println(name);
		*/
		
		/**********************3告诉浏览器响应的文件类型************************/
		// 根据文件名获取mime类型
		String mimeType = this.getServletContext().getMimeType(name);
		// 设置相应类型
		response.setContentType(mimeType);
		
		/**********************4.告诉浏览器是以附件的形式下载************************/
		// 告诉浏览器是以附件的形式下载
		// 获取客户端信息
		String agent = request.getHeader("User-Agent");
		// 定义一个变量记录编码之后的名字
		String filenameEncoder = "";
		if (agent.contains("MSIE")) {
			// IE编码
			filenameEncoder = URLEncoder.encode(name, "utf-8");
			filenameEncoder = filenameEncoder.replace("+", " ");
		} else if (agent.contains("Firefox")) {
			// 火狐编码
			BASE64Encoder base64Encoder = new BASE64Encoder();
			filenameEncoder = "=?utf-8?B?" + base64Encoder.encode(name.getBytes("utf-8")) + "?=";
		} else {
			// 浏览器编码
			filenameEncoder = URLEncoder.encode(name, "utf-8");
		}
		
		response.setHeader("Content-Disposition", "attachment;filename="+filenameEncoder);
		
		
		/**********************5.加载文件响应给浏览器************************/
		// 得到文件路径
		String path = this.getServletContext().getRealPath("/download/"+name);
		System.out.println(path);
		
		// 输入流
		FileInputStream in = new FileInputStream(path);
		
		// 输出流
		ServletOutputStream out = response.getOutputStream();
		
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = in.read(buffer)) != -1) {
			System.out.println(len);
			System.out.println(Arrays.toString(buffer));
			out.write(buffer,0,len);
		}
		
		// 关闭文件
		in.close();
		
	}

}

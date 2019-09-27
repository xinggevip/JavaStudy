package com.gaoxing.resimgservlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/resimgservlet")
public class ResImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 输出图片
		
		// 得到图片路径
		String paht = this.getServletContext().getRealPath("girl.jpg");
		
		// 加载这张图片
		FileInputStream in = new FileInputStream(paht);
		
		// 输出
		ServletOutputStream out = response.getOutputStream();

		
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = in.read(buffer)) != -1) {
			System.out.println(len);
			System.out.println(Arrays.toString(buffer));
			out.write(buffer,0,len);
		}
		
		in.close();
		
	}

}

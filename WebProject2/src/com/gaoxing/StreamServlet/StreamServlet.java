package com.gaoxing.StreamServlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Buffer;

import sun.security.util.Length;

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
		
		// 读取多个字节码
		FileInputStream in1 = new FileInputStream(path);
		byte[] buffer = new byte[3];
		int len = in1.read(buffer);
		System.out.println(len); // 3 读了3个字符
		System.out.println(Arrays.toString(buffer));
		
		len = in1.read(buffer);
		System.out.println(len); // 1 读了1个字符
		System.out.println(Arrays.toString(buffer));
		
		len = in1.read(buffer);
		System.out.println(len); // -1 一个字符也没读
		System.out.println(Arrays.toString(buffer));
		// 关闭文件
		in1.close();
		
		// 读取整个文件
		System.out.println("--------华丽的分割线--------");
		FileInputStream in2 = new FileInputStream(path);
		byte[] buffer2 = new byte[3];
		System.out.println(Arrays.toString(buffer2)); // [0,0]
		
		while((len = in2.read(buffer2)) != -1) {
			System.out.println(len);
			System.out.println(Arrays.toString(buffer2));
			// 读取buffer2,从0开始读，读到len下标
			System.out.println(new String(buffer2,0,len));
		}
		
		in2.close();
	}

}

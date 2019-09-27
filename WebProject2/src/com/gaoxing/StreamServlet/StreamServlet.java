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
		// ��ȡ�ַ�
		
		// ����һ���ļ�
		// һ��ʹ�þ���·��
		String path = this.getServletContext().getRealPath("a.txt");
		System.out.println(path); // F:\GitSpace\JavaStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\WebProject2\a.txt
		
		// �����ļ��ֽ���
		FileInputStream in = new FileInputStream(path);
		System.out.println(in); // java.io.FileInputStream@3dff3ba4
		
		// ��ȡ�ļ�
		// ��һ���ֽ���  ����ASCII��
		System.out.println(in.read()); // 65
		System.out.println(in.read()); // 66
		System.out.println(in.read()); // 67
		System.out.println(in.read()); // 68
		// û���ַ��ɶ�����-1
		System.out.println(in.read()); // -1
		
		// �ر��ļ�
		in.close();
	}

}

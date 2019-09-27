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
		
		// ��ȡ����ֽ���
		FileInputStream in1 = new FileInputStream(path);
		byte[] buffer = new byte[3];
		int len = in1.read(buffer);
		System.out.println(len); // 3 ����3���ַ�
		System.out.println(Arrays.toString(buffer));
		
		len = in1.read(buffer);
		System.out.println(len); // 1 ����1���ַ�
		System.out.println(Arrays.toString(buffer));
		
		len = in1.read(buffer);
		System.out.println(len); // -1 һ���ַ�Ҳû��
		System.out.println(Arrays.toString(buffer));
		// �ر��ļ�
		in1.close();
		
		// ��ȡ�����ļ�
		System.out.println("--------�����ķָ���--------");
		FileInputStream in2 = new FileInputStream(path);
		byte[] buffer2 = new byte[3];
		System.out.println(Arrays.toString(buffer2)); // [0,0]
		
		while((len = in2.read(buffer2)) != -1) {
			System.out.println(len);
			System.out.println(Arrays.toString(buffer2));
			// ��ȡbuffer2,��0��ʼ��������len�±�
			System.out.println(new String(buffer2,0,len));
		}
		
		in2.close();
	}

}

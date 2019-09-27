package com.gaoxing.response;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responseservlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������Ӧͷ����Ӧ�У���Ӧ��
		// ����״̬��
		response.setStatus(301);
		System.out.println("service----------");
		
		// �����Ӧͷ
		response.addHeader("name", "gaoxing");
		response.addIntHeader("age", 10);
		response.addDateHeader("my-Date", new Date().getTime());
		
		// ������Ӧͷ  ���޸��Լ���ӵ�Ҳ���޸�Ĭ�ϵ�
		response.setHeader("name", "Mr Gao");
		response.addIntHeader("age", 22);
		
		// 301�ض���
		// ͨ��������Ӧͷ
//		response.setHeader("location", "/WebProject2/reloca");
		// ͨ����װ�ķ���
//		response.sendRedirect("/WebProject2/reloca");
		// ��ʱˢ���ض��� ��3�����ض���
//		response.setHeader("refresh", "3;url=/WebProject2/reloca");
		response.setHeader("refresh", "3;url=https://www.baidu.com");
		
		
		
		
	}

}

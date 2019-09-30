package com.gaoxing.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaoxing.service.AdminService;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �����û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + password);
		// ���õ�¼��ҵ��
		AdminService adminService = new AdminService();
		try {
			adminService.login(username,password);
			System.out.println("��¼�ɹ�");
		} catch (Exception e) {
			if (e.getMessage().equals("�û������������")) {
				System.out.println("��¼ʧ��");
				// ��ת�ص�¼ҳ�����Դ�����Ϣ
				request.setAttribute("err", e.getMessage());
				// ת�����������ڲ�ת��
				request.getRequestDispatcher("admin/admin_login.jsp").forward(request, response);
			}else {
				e.printStackTrace();
			}
		}
		
	}

}

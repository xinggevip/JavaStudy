package com.gaoxing.Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 1.��ȡsession
		HttpSession session = request.getSession();
		// Session��־û�
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setPath("/CookSession");
		cookie.setMaxAge(60*2);
		response.addCookie(cookie);
		System.out.println(session);
		session.setAttribute("key", "value");
		// �ر����������������id��ֻ��id�浽�˻����У�id�����Ż���û�ˣ�ֻҪ�û���־û�������
	}

}

package com.gaoxing.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.gaoxing.domain.User;
import com.gaoxing.jdbc.util.JdbcUtil;


@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegistServlet--------------");
		// 1.�ж���֤���Ƿ���ȷ
		// 2.�������в��� ��װ��User����
		// 3.����uid
		// 4.д�뵽���ݿ�
		
		
		
		
		// ����������룬��Ӧ����
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1.�ж���֤���Ƿ���ȷ
		// �����ȷ�������̣�������ת��ȥ
		String code = request.getParameter("code");
		System.out.println("code = " + code);
		// ��ȡ���������ɵ���֤��
		String word = (String)this.getServletContext().getAttribute("checkCode");
		if (code.equals(word)) {
			System.out.println("��֤����ȷ");
			// 2.�����֤����ȷ���������в�������װ��user����
			Map<String, String[]> parameterMap = request.getParameterMap();
			User user = new User();
			try {
				BeanUtils.populate(user, parameterMap);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			// 3.����uid
			String uid = UUID.randomUUID().toString();
			user.setUid(uid);
			System.out.println(user);
			// 4.�Ѷ���浽���ݿ���
			QueryRunner qr = JdbcUtil.getQueryRunner();
			String sql = "insert into user value(?,?,?,?)";
			try {
				qr.update(sql,user.getUid(),user.getUsername(),user.getPassword(),user.getPhone());
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().write("ע��ɹ���3�����ת����½ҳ��...");
			response.setHeader("refresh", "3;url=/MyStore2/login.html");
			
		}else {
			response.getWriter().write("��֤�����3�����ת��ע��ҳ��...");
			response.setHeader("refresh", "3;url=/MyStore2/regist.html");
		}
	}

}

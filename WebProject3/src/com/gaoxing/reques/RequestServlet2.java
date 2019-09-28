package com.gaoxing.reques;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.gaoxing.domain.User;

@WebServlet("/RequestServlet2")
public class RequestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����������룬ֻ������post
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		System.out.println(name);
		// ��ȡ���в���
		Map<String, String[]> parameterMap = request.getParameterMap();
		/*
		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + Arrays.toString(entry.getValue()));
		}
		*/
		// �ѻ�ȡ�Ĳ�����װ�ɶ���
		User user = new User();
		try {
			BeanUtils.populate(user, parameterMap);
			System.out.println(user); // User [username=����, pwd=fr2c, sex=��, love=[����, �Ⱦ�, ��ͷ��]]
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

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
		// 结局中文乱码，只适用于post
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		System.out.println(name);
		// 获取所有参数
		Map<String, String[]> parameterMap = request.getParameterMap();
		/*
		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + Arrays.toString(entry.getValue()));
		}
		*/
		// 把获取的参数封装成对象
		User user = new User();
		try {
			BeanUtils.populate(user, parameterMap);
			System.out.println(user); // User [username=高星, pwd=fr2c, sex=男, love=[抽烟, 喝酒, 烫头发]]
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

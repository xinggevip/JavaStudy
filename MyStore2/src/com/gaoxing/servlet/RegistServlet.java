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
		// 1.判断验证码是否正确
		// 2.接收所有参数 封装成User对象
		// 3.设置uid
		// 4.写入到数据库
		
		
		
		
		// 设置请求编码，响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1.判断验证码是否正确
		// 如果正确继续流程，否则跳转回去
		String code = request.getParameter("code");
		System.out.println("code = " + code);
		// 获取服务器生成的验证码
		String word = (String)this.getServletContext().getAttribute("checkCode");
		if (code.equals(word)) {
			System.out.println("验证码正确");
			// 2.如果验证码正确，接收所有参数，封装成user对象
			Map<String, String[]> parameterMap = request.getParameterMap();
			User user = new User();
			try {
				BeanUtils.populate(user, parameterMap);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			// 3.设置uid
			String uid = UUID.randomUUID().toString();
			user.setUid(uid);
			System.out.println(user);
			// 4.把对象存到数据库中
			QueryRunner qr = JdbcUtil.getQueryRunner();
			String sql = "insert into user value(?,?,?,?)";
			try {
				qr.update(sql,user.getUid(),user.getUsername(),user.getPassword(),user.getPhone());
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().write("注册成功！3秒后跳转到登陆页面...");
			response.setHeader("refresh", "3;url=/MyStore2/login.html");
			
		}else {
			response.getWriter().write("验证码错误！3秒后跳转到注册页面...");
			response.setHeader("refresh", "3;url=/MyStore2/regist.html");
		}
	}

}

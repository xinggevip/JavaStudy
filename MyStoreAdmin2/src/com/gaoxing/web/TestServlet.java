package com.gaoxing.web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends BaseServlet {
	
		/*
		if (action.equals("add")) {
			// ���
			desPath = add(request,response);
		}else if (action.equals("del")) {
			// ɾ��
			desPath = del(request,response);
		}else if (action.equals("update")) {
			// ����
			desPath = update(request,response);
		}
		*/

	public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��Ӳ���");
		return "add.jsp";
	}
	
	public String del(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ɾ������");
		return "del.jsp";
	}
	
	public String update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("���²���");
		return "update.jsp";
	}
}

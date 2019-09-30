package com.gaoxing.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaoxing.domain.Category;
import com.gaoxing.service.CategoryService;

@WebServlet("/GoodsAddUIServlet")
public class GoodsAddUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ϊ�����Ʒҳ��׼����������
		// 1.ȡ�����з���
		// 2.�ѷ��������
		// 3.ת��add.jsp
		System.out.println("GoodsAddUIServlet---");
		// 1.ȡ�����з���
		CategoryService categoryService = new CategoryService();
		List<Category> allCategory = null;
		try {
			allCategory = categoryService.findCategory();
			// 2.�ѷ��������
			request.setAttribute("allCategory", allCategory);
			System.out.println(allCategory);
			// 3.ת��add.jsp
			request.getRequestDispatcher("admin/add.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}

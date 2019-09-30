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
		// 为添加商品页面准备分类数据
		// 1.取出所有分类
		// 2.把分类存域当中
		// 3.转发add.jsp
		System.out.println("GoodsAddUIServlet---");
		// 1.取出所有分类
		CategoryService categoryService = new CategoryService();
		List<Category> allCategory = null;
		try {
			allCategory = categoryService.findCategory();
			// 2.把分类存域当中
			request.setAttribute("allCategory", allCategory);
			System.out.println(allCategory);
			// 3.转发add.jsp
			request.getRequestDispatcher("admin/add.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}

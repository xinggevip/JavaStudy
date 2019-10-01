package com.gaoxing.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaoxing.domain.Category;
import com.gaoxing.domain.Goods;
import com.gaoxing.service.CategoryService;
import com.gaoxing.service.GoodsService;

@WebServlet("/GoodsEditUIServlet")
public class GoodsEditUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收id，根据id修改商品
		String id = request.getParameter("id");
		System.out.println("GoodsEditUIServlet======" + id);
		
		// 存商品信息
		GoodsService goodsService = new GoodsService();
		Goods goods = new Goods();
		
		// 存分类信息
		CategoryService categoryService = new CategoryService();
		List<Category> allCategory = null;

	
		try {
			// 1.获取商品信息并存到域
			goods = goodsService.getGoodsWidthId(id);
			request.setAttribute("goods", goods);
			System.out.println(goods);
			
			// 2.获取分类信息并存到域
			allCategory = categoryService.findCategory();
			request.setAttribute("allCategory", allCategory);
			System.out.println(allCategory);
			
			// 3.服务器内部转发
			request.getRequestDispatcher("admin/edit.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

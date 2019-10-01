package com.gaoxing.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaoxing.service.GoodsService;


@WebServlet("/GoodsDelServlet")
public class GoodsDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据id删除商品
		String id = request.getParameter("id");
		System.out.println(id);
		GoodsService goodsService = new GoodsService();
		try {
			goodsService.deleteGoods(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/GoodsListServlet").forward(request, response);
	}

}

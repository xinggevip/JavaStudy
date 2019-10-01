package com.gaoxing.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaoxing.domain.Goods;
import com.gaoxing.service.GoodsService;

@WebServlet("/GoodsListServlet")
public class GoodsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsService goodsService = new GoodsService();
		try {
			List<Goods> allGoods = goodsService.getAllGoods();
			// 商品集合反转
			Collections.reverse(allGoods);
			System.out.println(allGoods);
			request.setAttribute("allGoods", allGoods);
			request.getRequestDispatcher("admin/main.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

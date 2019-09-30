package com.gaoxing.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.gaoxing.domain.Goods;
import com.gaoxing.jdbc.util.JdbcUtil;
import com.gaoxing.service.GoodsService;

@WebServlet("/GoodServlet")
public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 1.连接数据库
		 * 2.从数据库中获取数据
		 * 3.把数据存到request域中
		 * 4.转发到商品列表页面，转发时把request对象传入
		 */
		
		List<Goods> allGoods = null;
		
		/*
		// 1.连接数据库
		QueryRunner qr = JdbcUtil.getQueryRunner();
		// 2.从数据库中获取数据
		String sql = "select * from goods";
		try {
			allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3.把数据存到request域中
		request.setAttribute("allGoods", allGoods);
		// 4.转发到商品列表页面，转发时把request对象传入
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
		*/
		
		GoodsService goodsService = new GoodsService();
		allGoods = goodsService.findAllGoods();
		// 3.把数据存到request域中
		request.setAttribute("allGoods", allGoods);
		// 4.转发到商品列表页面，转发时把request对象传入
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
	}

}

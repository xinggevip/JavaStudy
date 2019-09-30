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
		 * 1.�������ݿ�
		 * 2.�����ݿ��л�ȡ����
		 * 3.�����ݴ浽request����
		 * 4.ת������Ʒ�б�ҳ�棬ת��ʱ��request������
		 */
		
		List<Goods> allGoods = null;
		
		/*
		// 1.�������ݿ�
		QueryRunner qr = JdbcUtil.getQueryRunner();
		// 2.�����ݿ��л�ȡ����
		String sql = "select * from goods";
		try {
			allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3.�����ݴ浽request����
		request.setAttribute("allGoods", allGoods);
		// 4.ת������Ʒ�б�ҳ�棬ת��ʱ��request������
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
		*/
		
		GoodsService goodsService = new GoodsService();
		allGoods = goodsService.findAllGoods();
		// 3.�����ݴ浽request����
		request.setAttribute("allGoods", allGoods);
		// 4.ת������Ʒ�б�ҳ�棬ת��ʱ��request������
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
	}

}

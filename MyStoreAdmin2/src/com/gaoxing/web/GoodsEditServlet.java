package com.gaoxing.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.gaoxing.domain.Goods;
import com.gaoxing.service.GoodsService;

@WebServlet("/GoodsEditServlet")
public class GoodsEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		
		// 1.��ȡ���в���
		Map<String, String[]> parameterMap = request.getParameterMap();
		// 2.�Ѳ�����װ�ɶ���
		Goods goods = new Goods();
		try {
			BeanUtils.populate(goods, parameterMap);
			// 3.����id��������
			System.out.println(goods);
			// ���÷����
			GoodsService goodsService = new GoodsService();
			goodsService.updateGoods(goods);
			// 4.ת��
			request.getRequestDispatcher("/GoodsListServlet").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

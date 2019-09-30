package com.gaoxing.service;

import java.sql.SQLException;
import java.util.List;

import com.gaoxing.dao.GoodsDao;
import com.gaoxing.domain.Goods;

public class GoodsService {

	public List<Goods> getAllGoods() throws SQLException {
		GoodsDao goodsDao = new GoodsDao();
		List<Goods> allGoods = goodsDao.getAllGoods();
		return allGoods;
	}

	public void deleteGoods(String id) throws SQLException {
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.delGoods(Integer.parseInt(id));
	}

}

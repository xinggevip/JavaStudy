package com.gaoxing.service;

import java.util.List;

import com.gaoxing.dao.GoodsDao;
import com.gaoxing.domain.Goods;

public class GoodsService {

	public List<Goods> findAllGoods() {
		GoodsDao goodsDao = new GoodsDao();
		List<Goods> allGoods = goodsDao.findAllGoods();
		return allGoods;
	}

}

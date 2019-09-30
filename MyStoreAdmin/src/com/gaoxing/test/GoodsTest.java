package com.gaoxing.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.gaoxing.dao.GoodsDao;
import com.gaoxing.domain.Goods;

public class GoodsTest {
	
	@Test
	public void testGetAllGoods() throws SQLException {
		GoodsDao goodsDao = new GoodsDao();
		List<Goods> allGoods = goodsDao.getAllGoods();
		System.out.println(allGoods);
	}
	
	@Test
	public void testAddGoods() throws SQLException {
		Goods goods = new Goods();
		goods.setName("乌合之众");
		goods.setPrice(1000.0);
		goods.setImage("https://www.baidu.com/img/baidu_jgylogo3.gif");
		
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.addGoods(goods);	
	}
	
	@Test
	public void testDelGoods() throws SQLException {
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.delGoods(16);
	}
	
	@Test
	public void testUpdateGoods() throws SQLException {
		Goods goods = new Goods();
		goods.setId(17);
		goods.setName("乌合之众111");
		goods.setPrice(999.0);
		goods.setImage("https://www.baidu.com/img/baidu_jgylogo3.gif");
		
		GoodsDao goodsDao = new GoodsDao();
		goodsDao.updateGoods(goods);
	}


}

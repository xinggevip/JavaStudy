package com.gaoxing.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.gaoxing.domain.Goods;
import com.gaoxing.jdbc.util.JdbcUtil;

public class GoodsDao {

	public List<Goods> findAllGoods() {
		List<Goods> allGoods = null;
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
		return allGoods;
	}

}

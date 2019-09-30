package com.gaoxing.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.gaoxing.domain.Goods;
import com.gaoxing.jdbc.util.JdbcUtil;

public class GoodsDao {
	private static QueryRunner qr = null;
	static {
		qr = JdbcUtil.getQueryRunner();
	}
	
	// 1.查询所有商品
	public List<Goods> getAllGoods() throws SQLException{
		
		String sql = "select * from goods";
		List<Goods> allGoods = null;
		allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		return allGoods;
	}
	
	// 2.添加商品到数据库
	public void addGoods(Goods goods) throws SQLException {
		String sql = "insert into goods(name,price,image,desc,is_hot,cid) value(?,?,?,?,?,?)";
		qr.update(sql, goods.getName(),goods.getPrice(),goods.getImage());
	}
	
	// 3.根据id从数据库当中删除一个商品
	public void delGoods(int id) throws SQLException {
		String sql = "delete from goods where id=?";
		qr.update(sql,id);
	}
	
	// 4.更新商品
	public void updateGoods(Goods goods) throws SQLException {
		String sql = "update goods set name=?,price=?,image=?,desc=?,is_hot=?cid=? where id=?";
		qr.update(sql,goods.getName(),goods.getPrice(),goods.getImage(),goods.getId());
	}
	

}

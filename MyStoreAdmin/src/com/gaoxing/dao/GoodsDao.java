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
	
	// 1.��ѯ������Ʒ
	public List<Goods> getAllGoods() throws SQLException{
		
		String sql = "select * from goods";
		List<Goods> allGoods = null;
		allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		return allGoods;
	}
	
	// 2.�����Ʒ�����ݿ�
	public void addGoods(Goods goods) throws SQLException {
		String sql = "insert into goods(name,price,image,desc,is_hot,cid) value(?,?,?,?,?,?)";
		qr.update(sql, goods.getName(),goods.getPrice(),goods.getImage());
	}
	
	// 3.����id�����ݿ⵱��ɾ��һ����Ʒ
	public void delGoods(int id) throws SQLException {
		String sql = "delete from goods where id=?";
		qr.update(sql,id);
	}
	
	// 4.������Ʒ
	public void updateGoods(Goods goods) throws SQLException {
		String sql = "update goods set name=?,price=?,image=?,desc=?,is_hot=?cid=? where id=?";
		qr.update(sql,goods.getName(),goods.getPrice(),goods.getImage(),goods.getId());
	}
	

}

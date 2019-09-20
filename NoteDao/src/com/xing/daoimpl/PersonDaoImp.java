package com.xing.daoimpl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.xing.dao.PersonDao;
import com.xing.module.Person;
import com.xing.smsuitl.ConnectionUtil;

public class PersonDaoImp implements PersonDao{
	
	// 登陆
	public boolean signin(String username,String pwd){
		Connection conn = ConnectionUtil.getConnection();
		
		String sql = "select username,password from user where username=? and password=?";
        PreparedStatement stt;
		try {
			stt = conn.prepareStatement(sql);
			stt.setString(1, username);
	        stt.setString(2, pwd);
	        ResultSet rs = stt.executeQuery();
	        //从登录用户给出的账号密码来检测查询在数据库表中是否存在相同的账号密码
//	        if (rs.next()) {
//	            System.out.println("登录成功！");
//	        } else {
//	            System.out.println("姓名或密码错误！\n请重新登录：");
//	        }
	        
	        return rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}
	
	// 注册
	public int singup(){
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stt;
		String sql = "INSERT INTO `user` VALUES (null, null, null, null, null, null, ?, ?)";
		int rowCount;
		String username;
		String pwd;
		Scanner sc = new Scanner(System.in);
		try {
			stt = conn.prepareStatement(sql);
			System.out.print("请输入用户名：");
			username = sc.nextLine();
			System.out.print("请输入密码:");
			pwd = sc.nextLine();
			stt.setString(1, pwd);
			stt.setString(2, username);
			rowCount = stt.executeUpdate();
			return rowCount;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	
	}
	
	
	// 查所有用户
	public void queryAll(){
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stt;
		String sql = "select `user`.`name` AS `name`,`pricetable`.`type` AS `type`,`pricetable`.`date` AS `date`,`pricetable`.`info` AS `info`,`pricetable`.`price` AS `price`,`classify`.`inout` AS `inout`,`user`.`sex` AS `sex`,`user`.`age` AS `age`,`user`.`mobilphone` AS `mobilphone`,`user`.`username` AS `username` from ((`classify` join `pricetable` on((`pricetable`.`type` = `classify`.`type`))) join `user` on((`pricetable`.`userid` = `user`.`id`)))";
		ResultSet res;
		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		try {
			stt = conn.prepareStatement(sql);
			res = stt.executeQuery();
			while (res.next()) {
				String name = res.getString("name");
				String type = res.getString("type");
				Timestamp timeStamp = res.getTimestamp("date");
				String date = sdf.format(timeStamp);
				String info = res.getString("info");
				BigDecimal price = res.getBigDecimal("price");
				String inout = res.getString("inout");
				String sex = res.getString("sex");
				int age = res.getInt("age");
				String mobilphone = res.getString("mobilphone");
				
				
				System.out.println("姓名\t" + "类型\t" + "日期\t\t\t" + "详情\t" + "价格\t" + "收支类型\t" + "性别\t" + "年龄\t" + "手机\t");
				System.out.println(name + "\t" + type + "\t" + date + "\t" + info + "\t" + price + "\t" + inout + "\t" + sex + "\t" + age + "\t" + mobilphone);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}

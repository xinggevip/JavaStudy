package com.xing.sms;

import com.xing.dao.PersonDao;
import com.xing.daoimpl.PersonDaoImp;

public class Client {
	static void showMenu (){
		PersonDaoImp p = new PersonDaoImp();
		
		p.signin("xing","132");
//		PersonDaoImp.singup();
		p.queryAll();
	}

	public static void main(String[] args) {
		showMenu();

	}

}

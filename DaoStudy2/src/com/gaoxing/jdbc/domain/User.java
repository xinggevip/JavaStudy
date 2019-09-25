package com.gaoxing.jdbc.domain;

public class User {
	String name;
	Integer money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", money=" + money + "]";
	}
	

	

}

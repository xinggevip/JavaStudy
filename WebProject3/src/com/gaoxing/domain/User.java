package com.gaoxing.domain;

import java.util.Arrays;

public class User {
	private String username;
	private String pwd;
	private String sex;
	private String[] love;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getLove() {
		return love;
	}
	public void setLove(String[] love) {
		this.love = love;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + ", sex=" + sex + ", love=" + Arrays.toString(love) + "]";
	}
	
	
	

}

package com.gaoxing.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class User {
	private String uid;
	private String username;
	private String password;
	private String phone;

}

package com.gaoxing.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Goods {
	private Integer id;
	private String name;
	private Double price;
	private String image;
	@Override
	public String toString() {
		return "domain [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + "]";
	}
	

}

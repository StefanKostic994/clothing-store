package com.products;

import com.sizes.ShoesSize;

public class Shoes extends Product {

	private ShoesSize size;

	public Shoes(String name, String brand, double price, String color, ShoesSize size) {
		super(name, brand, price, color);
		this.size = size;
	}

	public ShoesSize getSize() {
		return size;
	}

	public void setSize(ShoesSize size) {
		this.size = size;
	}

}

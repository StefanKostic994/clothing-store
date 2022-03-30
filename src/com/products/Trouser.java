package com.products;

import com.sizes.JacketTrouserSize;

public class Trouser extends Product {

	private JacketTrouserSize size;

	public Trouser(String name, String brand, double price, String color, JacketTrouserSize size) {
		super(name, brand, price, color);
		this.size = size;
	}

	public JacketTrouserSize getSize() {
		return size;
	}

	public void setSize(JacketTrouserSize size) {
		this.size = size;
	}

}

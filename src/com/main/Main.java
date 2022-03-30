package com.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import com.calculation.Cashier;
import com.products.Jacket;
import com.products.Product;
import com.products.Shirt;
import com.products.Shoes;
import com.products.Trouser;
import com.sizes.JacketTrouserSize;
import com.sizes.ShirtSize;
import com.sizes.ShoesSize;

public class Main {

	public static void main(String[] args) {
		
		// First example
		Product shirt1 = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", ShirtSize.M);
		Product shirt2 = new Shirt("White Cotton Shirt", "BrandS", 15.99, "white", ShirtSize.M);
		Product trousers1 = new Trouser("Black Cotton Trousers", "BrandS", 29.99, "black", JacketTrouserSize.FIFTY);
		Product shoes1 = new Shoes("Black Leather Shoes", "BrandS", 59.99, "black", ShoesSize.FORTY_THREE);
		Product jacket1 = new Jacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", JacketTrouserSize.FIFTY);

		ArrayList<Product> products1 = new ArrayList<>();

		products1.add(shirt1);
		products1.add(shirt2);
		products1.add(trousers1);
		products1.add(shoes1);
		products1.add(jacket1);

		Cashier cashier1 = new Cashier();
		cashier1.printBill(products1, LocalDateTime.now());

		// Second example

		Product shirt3 = new Shirt("Black Silk Shirt", "BrandS", 29.99, "black", ShirtSize.L);
		Product shirt4 = new Shirt("White Silk Shirt", "BrandS", 29.99, "white", ShirtSize.L);

		ArrayList<Product> products2 = new ArrayList<>();
		products2.add(shirt3);
		products2.add(shirt4);

		Cashier cashier2 = new Cashier();
		cashier2.printBill(products2, LocalDateTime.now());

		// Third example

		Product trousers2 = new Trouser("Red Linen Trousers", "BrandS", 49.99, "red", JacketTrouserSize.FIFTY_SIX);
		Product shoes2 = new Shoes("Red Suede Shoes", "BrandS", 59.99, "black", ShoesSize.FORTY_FOUR);
		Product shoes3 = new Shoes("Black Suede Shoes", "BrandS", 59.99, "black", ShoesSize.FORTY_FOUR);
		Product jacket2 = new Jacket("Red Linen Suit Jacket", "BrandJ", 99.99, "red", JacketTrouserSize.FIFTY_SIX);
		Product shirt5 = new Shirt("White Linen Shirt", "BrandS", 29.99, "white", ShirtSize.L);

		ArrayList<Product> products3 = new ArrayList<>();
		products3.add(trousers2);
		products3.add(shoes2);
		products3.add(shoes3);
		products3.add(jacket2);
		products3.add(shirt5);

		Cashier cashier3 = new Cashier();
		cashier3.printBill(products3, LocalDateTime.now());

	}

}

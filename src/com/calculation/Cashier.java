package com.calculation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.products.Product;
import com.products.Shirt;
import com.products.Shoes;

public class Cashier {

	public void printBill(ArrayList<Product> products, LocalDateTime time) {

		if (products.size() == 0) {
			System.out.println("You do not have any products in your shopping cart!");
			return;
		}

		printingHeaderOfBill(time);

		double billPrice = 0;
		double allDiscountValue = 0;

		for (Product product : products) {
			int discountPercentage = 0;
			double discountValue = 0;
			if (products.size() >= 3) {
				if (isItTuesday() && product.getClass() == Shoes.class) {
					discountPercentage = 25; // 25%
					discountValue = product.getPrice() / 4;
				} else {
					discountPercentage = 20; // 20%
					discountValue = product.getPrice() / 5;
				}
			} else {
				if (isItTuesday() && product.getClass() == Shoes.class) { //
					discountPercentage = 25; // 25%
					discountValue = product.getPrice() / 4;
				}
				if (isItTuesday() && product.getClass() == Shirt.class) {
					discountPercentage = 10; // 10%
					discountValue = product.getPrice() / 10;
				}
			}

			billPrice += formatPrice(product.getPrice());
			allDiscountValue += formatPrice(discountValue);

			printingBodyOfBill(product, discountPercentage, discountValue); // For each product on the bill this method will be called
		}

		double realPrice = formatPrice(billPrice) - formatPrice(allDiscountValue);

		printingFooterOfBill(billPrice, allDiscountValue, realPrice);

	}

	private String formatCurrentDateTime(LocalDateTime time) {
		return time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	private boolean isItTuesday() {
		return LocalDate.now().getDayOfWeek().toString() == DayOfWeek.TUESDAY.toString(); 
	}

	private double formatPrice(double price) {
		return Double.parseDouble(String.format("%,.2f", price));
	}

	private void printingHeaderOfBill(LocalDateTime time) {
		System.out.println("Date: " + formatCurrentDateTime(time) + "\n");
		System.out.println("---Products---\n");
	}

	private void printingBodyOfBill(Product product, double discountPercentage, double discountValue) {
		System.out.println(product.getName() + "-" + product.getBrand());
		System.out.println("$" + product.getPrice());
		System.out.println("#discount " + discountPercentage + "%" + " -$" + formatPrice(discountValue));
		System.out.println();
	}

	private void printingFooterOfBill(double billPrice, double alldiscountValue, double realPrice) {
		System.out.println("--------------------------------------------");
		System.out.println("SUBTOTAL: " + "$" + formatPrice(billPrice));
		System.out.println("DISCOUNT: " + "-$" + formatPrice(alldiscountValue) + "\n");
		System.out.println("TOTAL: " + "$" + formatPrice(realPrice));
		System.out.println("\n\n\n\n\n\n\n");
	}
}

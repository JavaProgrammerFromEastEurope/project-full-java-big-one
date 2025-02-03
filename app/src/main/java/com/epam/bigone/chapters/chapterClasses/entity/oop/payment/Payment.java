package com.epam.bigone.chapters.chapterClasses.entity.oop.payment;

import java.util.List;
import java.util.Objects;

public class Payment {

	private final List<Purchase> purchases;

	public Payment(List<Purchase> purchases) {
		this.purchases = purchases;
	}

	public List<Purchase> getPurchases() {
		return purchases;
	}

	public int getAllPaymentsCost() {
		int finalCost = 0;
		for (Purchase purchase : purchases) {
			finalCost += purchase.getCost();
		}
		return finalCost;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Payment payment = (Payment) o;
		return Objects.equals(purchases, payment.purchases);
	}

	@Override
	public int hashCode() {
		return Objects.hash(purchases);
	}

	@Override
	public String toString() {
		return String.format("Payment{purchases=%s}", purchases);
	}
}
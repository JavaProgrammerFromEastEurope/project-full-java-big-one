package com.epam.bigone.app.sortComparator.impl.classes.customers;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterClasses.entity.common.customer.Customer;

public class SortByCustomerFirstName implements SortTemplate<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getFirstName().compareTo(c2.getFirstName());
	}
}

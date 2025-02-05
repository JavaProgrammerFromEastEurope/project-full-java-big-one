package com.epam.bigone.chapters.chapterClasses.action.impl;

import static java.lang.System.out;

import com.epam.bigone.chapters.chapterClasses.action.ClassAction;
import com.epam.bigone.chapters.chapterClasses.entity.common.customer.Customer;
import com.epam.bigone.chapters.chapterClasses.entity.common.customer.CustomerCollection;

public class CustomerAction implements ClassAction {

	CustomerCollection customerCollection;

	@Override
	public void inputVariables() {
		customerCollection = new CustomerCollection();

		customerCollection.getCustomerList()
				.add(new Customer("Kyle", "Broflovski",
						"1002 Avenue de los Mexicanos", 2345, 534634));

		customerCollection.getCustomerList()
				.add(new Customer("Stan", "Marsh",
						"260 Avenue de los Mexicanos", 6345, 636430));

		customerCollection.getCustomerList()
				.add(new Customer("Eric", "Cartman",
						"28201 E. Bonanza St.", 7345, 423534));

		customerCollection.getCustomerList()
				.add(new Customer("Kenny", "McCormick",
						"635 Avenue de Los Mexicanos", 0, 234235));
	}

	@Override
	public void printResult() {
		out.printf(" Customers sorting by Customer First Name:%n %s%n",
				customerCollection.sortByCustomerFirstName());

		out.println(" Customer collection sorting by credit car numbers from 5000 to 9000:");
		CustomerCollection.getCustomerCreditCardNumber(
				customerCollection.getCustomerList(), 5000, 9000);
	}
}
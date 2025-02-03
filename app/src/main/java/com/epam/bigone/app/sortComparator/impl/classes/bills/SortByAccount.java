package com.epam.bigone.app.sortComparator.impl.classes.bills;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterClasses.entity.composition.bills.Account;
import com.epam.bigone.chapters.chapterClasses.entity.composition.bills.Client;

public class SortByAccount implements SortTemplate<Client> {

	@Override
	public int compare(Client o1, Client o2) {
		o1.getAccounts().sort(Account::compareTo);
		o2.getAccounts().sort(Account::compareTo);
		return 		o1.getAccounts().hashCode()
						- o2.getAccounts().hashCode();
	}
}

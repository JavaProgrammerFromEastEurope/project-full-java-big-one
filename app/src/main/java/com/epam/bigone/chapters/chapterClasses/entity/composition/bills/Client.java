package com.epam.bigone.chapters.chapterClasses.entity.composition.bills;

import java.util.List;

public class Client extends Thread {

	private final List<Account> accounts;

	public Client(String name, List<Account> accounts) {
		setName(name);
		this.accounts = accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			accounts.get(0).withdraw(100);
		}
	}

	@Override
	public String toString() {
		return String.format(
				"Customer - %s accounts = %s", getName(), accounts);
	}
}
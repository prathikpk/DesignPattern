package com.Aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	public int accountNumber;
	public String name;
	public double balance;
	public List<INotifier> notify = new ArrayList<INotifier>();

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<INotifier> getNotify() {
		return notify;
	}

	public void setNotify(List<INotifier> notify) {
		this.notify = notify;
	}

	public void withdraw(double amount) {
		if (balance - amount < 500) {
			System.out.println("Insufficient balance");
			;
		} else {
			balance -= amount;
			
			for(INotifier no:notify)
				no.sendNotification(this,amount,"Withdraw");
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;
		for(INotifier no:notify)
			no.sendNotification(this,amount,"Deposit");
	}

	public void registerNotifier(INotifier notification) {
		notify.add(notification);
	}

}

package com.Aurionpro.test;

import com.Aurionpro.model.Account;
import com.Aurionpro.model.EmailNotifier;
import com.Aurionpro.model.SMSNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Account ac=new Account(1002, "Karan", 10000);
		ac.registerNotifier(new SMSNotifier());
		ac.registerNotifier(new EmailNotifier());
		ac.withdraw(1000);
		System.out.println("--------------------------");
		ac.deposit(2000);
	}

}

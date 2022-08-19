package com.Aurionpro.model;

public class EmailNotifier implements INotifier {

	@Override
	public void sendNotification(Account user,double amount,String Transaction) {
	System.out.println("send email notification");
	System.out.println("TransactionType is:"+Transaction);
	System.out.println("Amount is:"+amount);
	System.out.println("Account Balance:"+user.getBalance());
	System.out.println("---------------------------");
	}

}

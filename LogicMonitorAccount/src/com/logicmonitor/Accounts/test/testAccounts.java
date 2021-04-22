package com.logicmonitor.Accounts.test;

import com.logicmonitor.Accounts.CurrentAccount;
import com.logicmonitor.Accounts.SavingAccount;

public class testAccounts {

	public static void main(String[] args) {
		addCurrentAcct();	 
	}
	
	static void addSavingAccount() {
		SavingAccount s= new SavingAccount(1234, "John", 100.00);
	    s.getBalance();
	    s.deposit(10);
	    s.getAccounts();
	}
	static void addMultipleSavingAcct() {
		SavingAccount s= new SavingAccount(1234, "John", 100.00);
		System.out.println("trying to add additional Saving acct to same customer:");
		s.AddAccounts(12341, "John", 100.00);	
	}
	
	static void addCurrentAcct() {
		CurrentAccount c= new CurrentAccount(12345, "Ronak", 200.00);
		c.getAccounts();
		c.withdraw(2);
		c.withdraw(123123);
	}
	 

}

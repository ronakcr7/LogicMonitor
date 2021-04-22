package com.logicmonitor.Accounts;

import java.util.HashSet;

public class SavingAccount extends RetailAccounts {
private HashSet<Integer> accounts = new HashSet<>();
	public SavingAccount(Integer accNumber,String name, double balance) {
		super('S', name, balance);
		if (accounts.add(accNumber)==false)
	 System.out.println("CUstomer Can have only single Saving account.");
	}

	public void AddAccounts(Integer accNumber,String name, double balance) {
		
		if (accounts.add(accNumber)==false)
			 System.out.println("CUstomer Can have only single Saving account.");
		if (accounts.size()>1)
			 System.out.println("CUstomer Can have only single Saving account.");

	}
	
 

	
	public void getAccounts() {
		System.out.println("Account:"+accounts);
	}
 }
 
 

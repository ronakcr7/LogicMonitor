package com.logicmonitor.Accounts;

import java.util.ArrayList;
 

public class CurrentAccount extends RetailAccounts {

 
private ArrayList<Integer> accounts=new ArrayList<>();
public CurrentAccount(Integer accNumber,String name, double balance) {
	super('C', name, balance);
	this.accounts.add(accNumber);

}
public void getAccounts() {
	System.out.println("Account:"+accounts);
}
}


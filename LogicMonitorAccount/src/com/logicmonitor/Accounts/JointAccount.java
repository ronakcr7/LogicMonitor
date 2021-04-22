package com.logicmonitor.Accounts;

import java.util.Arrays;
import java.util.HashSet;

public class JointAccount extends RetailAccounts {
 private double accountid;
 private String AccountnameOne;
 private String custidOne;
 private String custidTwo;
 private String AccountnameTwo;
 private HashSet<String> accounts =new HashSet<>();
 public JointAccount(char accoutType,String custIdOne,String custIdTwo, String Primaryname,String secondaryName, double balance) {
		super(accoutType, Primaryname+","+secondaryName, balance);
		char[] finalCustId=(custIdOne+custIdTwo).toCharArray();
		Arrays.sort(finalCustId);
		if(accounts.add(String.valueOf(finalCustId))==false)
			 System.out.println("CUstomer Can have only single Saving account.");
		
 }
 
	public void AddAccounts(String accNumber) {
		if (accounts.add(accNumber)==false)
			 System.out.println("CUstomer Can have only single Saving account.");
			
	}
}

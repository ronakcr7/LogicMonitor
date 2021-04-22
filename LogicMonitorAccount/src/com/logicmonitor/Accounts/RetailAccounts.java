package com.logicmonitor.Accounts;

public abstract class RetailAccounts {
	public static final double INTERESTRATE_S=0.0;
	public static final double INTERESTRATE_C=2.5;
	public static final double WITHDRAWLIMIT_S=100000.00;
	
	private double interestRate;
	private double withdrawLimit;
	private char accoutType;
	private String name;
	private double balance;

	 

	public RetailAccounts(char accoutType,  String name, double balance) {
		super();
		if(accoutType!='S' && accoutType!='C')
			System.out.println("Error:Invalid Account Type,please pass S for Saving Account or C for CUrrent Account");
		else if(balance<0.0)
			System.out.println("Invalid Account Balance");
		else {
			 this.accoutType = accoutType;
				this.name = name;
				this.balance = balance;	
		if(accoutType=='S') {
			this.interestRate = INTERESTRATE_S;
			this.withdrawLimit = WITHDRAWLIMIT_S;
			System.out.println("Congratulations "+this.name+"! your Account is Created Successfully.");
			System.out.println("Account Type:Saving");
			System.out.println("Interest Rate:"+this.interestRate);
			System.out.println("Withdraw Limit: Rs."+this.withdrawLimit);
			System.out.println("Withdraw Limit: Rs."+this.withdrawLimit);
			System.out.println("account Balance:"+this.balance);
		}
		else if(accoutType=='C') {
			this.interestRate = INTERESTRATE_C;
			System.out.println("Congratulations "+this.name+"! your Account is Created Successfully.");
			System.out.println("Account Type:Current");
			System.out.println("Interest Rate: Rs."+this.interestRate);
			System.out.println("Withdraw Limit:No limit"); 
			System.out.println("account Balance:"+this.balance);
		}
		 
		
		}
		
	}
    public void deposit(double depositAmount)                        
      {                                                                
          if (depositAmount > 0.0)     
          {   balance = balance + depositAmount; 
          System.out.println("account Balance:"+this.balance);
          }
          else {
        	  System.out.println("Invalid deposit Amount:"+depositAmount);
                
          }
        	  
      }                                                                

    public void withdraw(double amount) {                   
        if (amount<=0){                
            System.out.println("Amount to be withdrawn should be positive"); 
        } 
        else {  
            if (balance < amount)   
                System.out.println("Insufficient balance");
        else {  
                balance = balance - amount;
           
                System.out.println("Amount Withdrawn successfully");
            }
        }
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public char getAccoutType() {
		return accoutType;
	}

	public void setAccoutType(char accoutType) {
		this.accoutType = accoutType;
	}

 

 

}

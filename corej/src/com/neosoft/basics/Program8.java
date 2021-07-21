package com.neosoft.basics;
class Account{
	private int acc_balance=25000;
	public int acc_balance(){
		return acc_balance;
	}
	
	  void withdrawal( int amount) throws WithdrawException{
		  if(amount> acc_balance) {
			  throw new WithdrawException(
					  String.format("Insufficient balance",acc_balance,amount)
					  
					  
					  );
		  }
		  
		  
		 
	  }
		   void showbalance() {
			   System.out.println("withdrawal Successful");
			   
			  
			   
		   }
		 
	 }
	
	
	


public class Program8 {

	public static void main(String[] args) throws WithdrawException {
		Account ac=new Account();
		ac.withdrawal(30000);
		ac.withdrawal(20000);
		ac.showbalance();
		ac.withdrawal(10000);
		ac.showbalance();
		
	

	}

}

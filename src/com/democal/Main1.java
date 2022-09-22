package com.democal;

public class Main1 {
	public static int withdraw(int balence, int amount) {
		return balence-amount;
	}
	public static int credit(int balence, int amount) {
		return balence+amount;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balence =5000;
		int amount =500;
		Bank b=new Bank(678,"sbi","9807654");
		System.out.println("balence after debited from accNo: "+b.getAccNum()+" is "+withdraw(balence,amount));
		System.out.println("balence after credited in accNo: "+b.getAccNum()+" is "+credit(balence,amount));

		
		

		
		

	}

}

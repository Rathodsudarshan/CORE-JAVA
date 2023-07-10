package javaProject;

import java.util.Scanner;

public class BankAccount {
	double bal;
	double PrevTrans;
	String name;
	String userId;

	BankAccount(String name,String userId){
		this.name=name;
		this.userId=userId;
	}
	void deposit(double Amount)
	{
		if(Amount!=0)
		{
			bal+=Amount;
			PrevTrans+=Amount;
		}
	}
	void withdraw(double amt)
	{
		if(amt!=0&&bal>=amt)
		{
			bal-=amt;
			PrevTrans=-amt;
		}
		else if(bal<amt) {
			System.out.println("Bank balance insufficient");
			
			
		}
	}
	void getPreviousTrans() {
		if(PrevTrans>0) {
			System.out.println("Deposited:"+PrevTrans);
		}
		else if(PrevTrans<0)
		{
			System.out.println("withdraw:"+Math.abs(PrevTrans))	;
			}
		else {
			System.out.println("No transaction occured");
			
		}
	}
	
public  void menu() {
	char option;
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome:-"+name);
	System.out.println("Your ID"+userId);
	System.out.println("/n");
	System.out.println("a)Check Balance");
	System.out.println("b)Deposite Amount");
	System.out.println("c)withdraw Amount");
	System.out.println("d)Previous transaction");
	System.out.println("e)Exit");
	
	do {
		System.out.println("****************************************");
		System.out.println("choose option");
		option =sc.next().charAt(0);
		System.out.println("\n");
		
		switch(option) {
		case 'a':
			System.out.println(".......................................");
			System.out.println("Balance="+bal);
			System.out.println(".......................................");
			System.out.println("\n");
			break;
		case 'b':
			System.out.println(".......................................");
			System.out.println("Enter a amaount to deposite");
			System.out.println(".......................................");
			double amt=sc.nextDouble();
			deposit(amt);
			System.out.println("\n");
			break;
			
		case 'c':
			System.out.println(".......................................");
			System.out.println("Enter a amaount to withdraw");
			System.out.println(".......................................");
			double amtW=sc.nextDouble();
			deposit(amtW );
			System.out.println("\n");
			break;
			
		case 'd':
			System.out.println(".......................................");
			System.out.println("Previous Transaction");
			getPreviousTrans();
			System.out.println(".......................................");
			
			System.out.println("\n");
			break;
			
		case 'e':
			System.out.println("..............................");
			 break;
			 default:
				 System.out.println("Choose a correct option to proceed");
				 break;
			
		}
		
	}while(option!='e');
	{
		System.out.println("Thanks you for using our banking services");
	}
	
	
}
}

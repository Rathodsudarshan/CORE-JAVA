package javaProject;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name and userId To Access your Bank");
	String name=sc.nextLine();
	String userId=sc.nextLine();
	
	BankAccount obj1=new BankAccount(name,userId);
    obj1.menu();
}
	

}


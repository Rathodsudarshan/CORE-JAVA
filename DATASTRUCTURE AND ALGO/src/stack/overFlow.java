package stack;

import java.util.Scanner;

class stack
{
	int top=-1;
	int n=10;
	int a[]=new int[n];
	void push()
	{
		if(top==(n-1))
		{
			System.out.println("overflow");
		}
		else
		{
			System.out.println("enter data");
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("item inserted");
			
		}}
		void pop()
		{
			if(top==-1)
			{
				System.out.println("underflow");
			}
			else
			{
				top=top-1;
				System.out.println("item deleted");
			}
		}
		void display()
		{
			System.out.println("item are:");
			for(int j=top;j>=0;j--)
			{
				System.out.println(a[j]);
			}
		}
	}


public class overFlow {
	public static void main(String args)
	{int d;
		Scanner sc= new Scanner(System.in);
		stack  s=new stack();

		int l;
		do {
			System.out.println("press 1 to push");
			System.out.println("press 2 to pop");
			System.out.println("press 3 to display");
			System.out.println("Enter your choice");
			d=sc.nextInt();
			switch (d)
			{
			case 1:
				s.push();
				break;
			
			case 2:
				s.pop();
				break;
				
			case 3:
				s.display();
				break;
				
			}
			System.out.println("enter the 0 go to the main menu");
			System.out.println("Enter any key to exist");
		l=sc.nextInt();	
		}while(l==0);
		System.out.println("Exit Successfully");
	}
	

}

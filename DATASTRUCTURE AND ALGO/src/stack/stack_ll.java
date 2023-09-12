package stack;

import java.util.Scanner;
class tack_1
{
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}}
		Node top=null;
	
	public void push(Scanner sc)
	{
		System.out.print("Enter data");
		int data=sc.nextInt();
		Node new_node=new Node(data);
		if(top==null)
		{
			top=new_node;
		}
		else {
			new_node.next=top;
			top=new_node;
		}
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			top=top.next;
			
		}
	}
	public void display()
	{
		Node temp=null;
		while(temp!=null)
		{
			System.out .println(temp.data);
			temp=temp.next;
		}
	}
	}

public class stack_ll {
	
	public static void main(String args)
	{int d;
		Scanner sc= new Scanner(System.in);
		tack_1 s=new tack_1();

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
				s.push(sc);
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





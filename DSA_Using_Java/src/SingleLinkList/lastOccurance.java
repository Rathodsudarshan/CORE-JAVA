package SingleLinkList;

import java.util.Scanner;

import SingleLinkList.NthNodeFromEnd.Node;

public class lastOccurance {
	public class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this .next=null;
		}
	}
	Node head=null;
	public void creation()
	{
		int data,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter data");
		do {
			data =sc.nextInt();
			Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
				
			}
			else
			{
				new_node=head;
				head=new_node;
			}
			System.out.println("do u want add more data ,if yes then press 1");
		n=sc.nextInt();	
		}while(n==1);
	}
	public Node deleteLast(Node head,int x)
	{
		Node temp=head;
		Node ptr=null;
		while(temp!=null)
		{
			if(temp.data==x)
			{
				ptr=temp;
				temp=temp.next;
			}
		}
		if(ptr!=null&&ptr.next==null)
		{
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		if(ptr!=null &&ptr.next!=null)
		{
			ptr.data=ptr.next.data;
			temp=ptr.next;
			ptr.next=ptr.next.next;
		}
		return head;
	}
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("ll is empty");
		}
	    while(temp!=null)
	    {
	    	System.out.println(temp.data);
	    	temp=temp.next;
	    	}
	    
	}
	public static void main(String []args)
	{
		lastOccurance l=new lastOccurance();
		l.creation();
		head = deleteLast(head, 4);
	    System.out.print("List after deletion of 4: ");
	    display(head);
		
	

}

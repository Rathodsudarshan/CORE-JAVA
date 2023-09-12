package SingleLinkList;

import java.util.Scanner;

import SingleLinkList.Reverse.Node;

public class NthNodeFromEnd {
	public class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation()
	{
		int data,n;
		do{
			Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			new_node.next=head;
			head=new_node;
		}
		System.out.println("do u want to add more data ,if yes then press the 1");
		n=sc.nextInt();
		
	}
		while(n==1);
	}
	public void NthNOde(int N)
	{
		int len=0;
		
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		
		if(len<N)
		{
			return;
			
		}
		temp=head;
		for(int i=1;i<len-N+1;i++)
			temp=temp.next;
		System.out.println("last Node:-"+temp.data);
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

	public static void main(String []args){
		NthNodeFromEnd m=new NthNodeFromEnd();
		m.creation();
		m.display();
		m.NthNOde(4);
		
		
		
	}
}

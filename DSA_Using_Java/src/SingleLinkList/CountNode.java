package SingleLinkList;

import java.util.Scanner;



public class CountNode {
	static class Node{
		int data;
		Node next;
		Node (int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation()
	{
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_node=new Node(data);//object creation
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			new_node.next=head;
			head=new_node;
		}
		System.out.print("do u want do add more data.if yes , then preaa 1");
		n=sc.nextInt();
		}
		while(n==1) ;
	}
	  public int count() {
		  int count=0;
		  Node current=head;
		  while(current!=null)
		  {
			  count++;
			  current=current.next;
		  }
		  return count;
	  }
	  public void dispaly() {
		  Node current=head;
		  if(current==null)
		  {
			  System.out.println("ll is empty");
			  
		  }
		  System.out.println("node of single linklist :-");
		  while(current!=null)
		  {
			  System.out.println(current.data);
			  current=current.next;
		  }
		
		  
	  }
	  public static void main(String[]args)
	  {
		  CountNode CN=new CountNode();
		  CN.creation();
		  CN.dispaly();
		  System.out.println("count of node:-"+CN.count());
	  }
	}
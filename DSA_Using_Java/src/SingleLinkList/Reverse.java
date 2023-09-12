package SingleLinkList;

import java.util.Scanner;

public class Reverse {
	public class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation() {
		int data,n;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Enter data");
			
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
				
			}
			else {
				new_node=head;
				head=new_node;
			}
			System.out.println("do you want add more data ,if yes then press 1");
			n=sc.nextInt();
		}while(n==1);
		
	}
	/*public void reverserNode(Node current)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		else {
			if(current.next==null)
			{
				
				System.out.println(current.data);
				return;
				
			}
			reverserNode(current.next);
			System.out.println(current.data+"");
		}
	}*/
	public Node reverse(Node node)
	{
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node= prev;
		return node;
	}
	
public void display()
{
	Node current=head;
	if(head==null)
	{
		System.out.println("ll is empty");
	}
    while(current!=null)
    {
    	System.out.println(current.data);
    	current=current.next;
    	}
    
}
public static void main(String []args)
{
	Reverse r=new Reverse();
	r.creation();
	r.display();
	r.reverse(head);
}
}

package DoubleLinklistDeletion;

import java.util.Scanner;

public class DoubleLinklist {
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			this .next=null;
			this.prev=null;
			
		}
		
	}
	Node head=null;
	Node tail=null;
	public void creation()
	{
		int data,n,m,p;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("enter the data");
			data=sc.nextInt();
			Node new_node= new Node(data);
			if(head==null)
			{
				head=new_node;
				tail=new_node;
				
			}
			else
			{
				System.out.println("Enter 1 to start,2 for end and 3 for specufic posotion");
				m=sc.nextInt();
				switch(m)
				{
				case 1:
					new_node.next=head;
					head.prev=new_node;
					head=new_node;
					break;
				case 2:
					tail.next=new_node;
					new_node.prev=tail;
					tail=new_node;
					break;
				case 3:
					System.out.println("enter the specific position:");
					p=sc.nextInt();
					Node temp1=head;
					Node ptr=temp1.next;
					for(int i=1;i<(p-1);i++)
					{
						temp1=ptr;
						ptr=ptr.next;
					}
					new_node.next=temp1.next;
					temp1.next=new_node;
					temp1.next=new_node;
					ptr.prev=new_node;
					break;
				}
			}
			System.out.println("Do u want to add dta ,if yes then press 1");
			n=sc.nextInt();
		}
		while(n==1);
		
				
			
			
		}
	public void traverser() {
		Node temp=head;
		if(head==null){
			System.out.println("LL does not exist");
			
			
		}
		else {
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public static void main(String []args)
	{
		 DoubleLinklist ll= new  DoubleLinklist();
		 ll.creation();
		 ll.traverser();
	}

}

import java.util.Scanner;

import CircularLinkList.Node1;




public class circular_insertion {
	static class Node1{
		int data;
		Node1 next;
		Node1(int data) {
		
		
			this.data=data;
			this.next=null;
			
		}
		
	}
	Node1 head=null;
	Node1 tail=null;
	public void creation()
	{
		int data,n,m,p;
	
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("Enter data");
			data=sc.nextInt();
		Node1 new_node=new Node1(data);
			if(head==null)
			{
				head=new_node;
				tail=new_node;
				new_node.next=head;
			}
			else {
				System.out.println("enter 1 to insert dat at begning,2 for at the end ,3 for at the specific position");
			   m=sc.nextInt();
			   
			
		switch(m)
		{
		case 1:
			new_node.next=head;
			head=new_node;
			tail.next=head;
			break;
			
		case 2:
			tail.next=new_node;
			tail=new_node;
			new_node.next=head;
			
			break;
			
		case 3:
			System.out.println("enter the position u want to be insert");
			p=sc.nextInt();
			Node1 temp1=head;
			for(int i=0;i<(p-1);i++)
			{
				temp1=temp1.next;
			}
			new_node.next=temp1.next;
			temp1.next=new_node;
			break;
		}
		}
			System.out.println("Do u want to add more data press 1");
			n=sc.nextInt();
		}
		while(n==1);
	}
	public void traverser()
	{
		
			  Node1 temp=head;
			  if(head==null)
			  {
				  System.out.print("ll does not exist");
			  }
			  else {
				  System.out.println("Node of circular linkedList");
				  do
				  {
					  System.out.print(temp.data+"");
					  temp=temp.next;
				  }
				  while(temp!=head);
			  }
	}
	public static void main(String[]args)
	{
		circular_insertion ll=new circular_insertion();
		ll.creation();
		ll.traverser();

	}
		
	}

	



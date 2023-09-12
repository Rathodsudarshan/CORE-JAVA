package CircularLinklistDeletion;

import java.util.Scanner;

import CircularLinkList.Node1;





public class CircularDeletion {


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
			int data,n;
		
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
					tail.next=new_node;
					tail=new_node;
					tail.next=head;
				
				}
			}

public void delete() {
	int data,n,m,p;
	Scanner sc= new Scanner(System.in);
	
	do
	{
		if(head==null)
		{
			System.out.println("ll is empty");
			
		}
		else {
			System.out.print("Enter 1 to delete at the begning ,press 2 for delete at the end,press 3 for at the specific positon");
			m=sc.nextInt();
			switch(m)
			{
			case 1:
				Node1 temp=head;
				temp=temp.next;
				head=temp;
				tail.next=head;
			case 2:
				Node1 temp1=head;
				Node1 ptr=temp1.next;
				while(ptr.next!=head)
				{
					temp1=ptr;
					ptr=ptr.next;
				}
				temp1.next=null;
				break;
				
			case 3:
				System .out.println("enter the position ");
				p=sc.nextInt();
				Node1 temp2=head;
				Node1 ptr1=temp2.next;
				for(int i=0;i<p-1;i++)
				{
					temp2=ptr1;
					ptr1=ptr1.next;
				}
			    temp2.next=ptr1.next;
			    break;
			}
		}  
				System.out.println("Do u want to add more data press 1");
			 n=sc.nextInt();
		}	
	
while(n==1);
	}
	
	
	
	

				
			
	
		
	public void travers()
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
			  CircularDeletion ll= new CircularDeletion ();
			  ll.delete();
			  ll.travers();
		  }
		  }
		



		
	




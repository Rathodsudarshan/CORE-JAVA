import java.util.Scanner;

public class SinglelinkList_insertion {
	
	
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
			int data,n,m,p;
			Scanner sc=new Scanner(System.in);
			do {
			System.out.println("Enter data");
			data=sc.nextInt();
			Node new_node=new Node(data);//object creation
			if(head==null)
			{
				head=new_node;
			}
			else {
				System.out.print("Enter 1 to insert the item at beginning ,2 to insert the itemat the end ,3 to insert the ");
				m=sc.nextInt();
				switch(m)
				{
				case 1:
					new_node.next=head;
					head=new_node;
					break;
					
				case 2:
					Node temp=head;
					while(temp.next!=null)
					{
						temp=temp.next;
						
					}
					temp.next=head;
					break;
				case 3:
					System.out.println("enter position of node to be inserted");
					 p=sc.nextInt();
					Node temp1=head;
					for(int i=0;i<(p-1);i++)
					{
						temp=temp1.next;
					}
					new_node.next=temp1.next;
					temp1.next=new_node;
					break;
				}
			}
			System.out.println("do u want to add .if yes,press:1");
			n=sc.nextInt();
			}
			while(n==1);
		}
		public void traverser()
		{
			Node temp=head;
			if(head==null)
			{
				System.out.print("LL DOES Not exist");
				
			}
			else {
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}
		}
		public static void main(String[]args)
		{
			SinglelinkList_insertion ll=new SinglelinkList_insertion();
			ll.creation();
			ll.traverser();

		}
			
		}




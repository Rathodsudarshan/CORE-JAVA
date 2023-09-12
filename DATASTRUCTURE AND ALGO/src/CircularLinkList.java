import java.util.Scanner;

public class CircularLinkList {
	static class Node1{
		int data;
		Node1 next;
		Node1(int data) {
		
		
			this.data=data;
			
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
	  CircularLinkList ll= new CircularLinkList();
	  ll.creation();
	  ll.travers();
  }
}

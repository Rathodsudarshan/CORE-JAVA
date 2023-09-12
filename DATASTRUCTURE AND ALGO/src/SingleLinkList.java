import java.util.Scanner;

public class SingleLinkList {
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
	public void delete()
	{
		
	}
	public void traverser()
	{Node temp=head;
		if(head==null)
		{
			System.out.println("ll doesnot exizt");
			
			}
		else {
			while(temp!=null)
			{
				System.out.print(temp.data);
				temp=temp.next;
			}
		}
		}
public static void main(String[]args)
{
	SingleLinkList ll=new SingleLinkList ();
	ll.creation();
	ll.traverser();
	
}
	

}

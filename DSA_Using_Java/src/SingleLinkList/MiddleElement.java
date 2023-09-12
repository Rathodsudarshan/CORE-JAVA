package SingleLinkList;

import java.util.Scanner;

import SingleLinkList.CountNode.Node;

public class MiddleElement {
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
	public void creation()
	{
		Scanner sc=new Scanner(System.in);
		int data,n;
		do{
		
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_node=new Node(data);
		
			if(head==null)
			{
				head=new_node;
			}
			else {
				new_node.next= head;
				head= new_node;
			}
			System.out.println("do u want to add more data, if yes then press 1");
			n=sc.nextInt();
			
		}
		while(n==1);
	}
	public int getlen()
	{ int length=0;
         Node temp=head;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		return length;
	}
	public void printMiddle()
	{
		if(head!=null)
		{
			int length=getlen();
			Node temp=head;
			int middle=length/2;
			while(middle!=0)
			{
				temp=temp.next;
				middle--;
			}
			System.out.println("the middle element [ "+temp.data+"]");
		}
	}
	public void display()

    { Node temp = head;
		if(head==null)
		{
			System.out.println("ll doesnot exist");
		}
		else {
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
       
		}                
    }
 
		
 
		
	public static void main(String []args)
	{
		MiddleElement m=new MiddleElement();
		m.creation();
		m.display(); 
		m.printMiddle();
	}

}

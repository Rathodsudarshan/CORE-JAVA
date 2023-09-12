package ArraysProblems;

import java.util.Scanner;

public class Insertion {
	public static void main(String[]args)
	{
		int n ,m,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int []a=new int[n];
		int []b=new int [n+1];
		System.out.println("Enter the all element ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter position which we have to insert element");
		m=sc.nextInt();
		System.out.println("Enter the value to be inserted");
		p=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
			{
				b[i]=p;
			}
			else
			{
				b[i]=a[i+1];
			}
		}
		System.out.println("Element are");
		for(int i=0;i<n+1;i++)
		{
			System.out.println(b[i]);
		}
				
		
	}

}

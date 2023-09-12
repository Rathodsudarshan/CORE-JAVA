package ArraysProblems;

import java.util.Scanner;

public class Deletion {
public static void main(String[]args)
{
	int n,m,p;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n");
	n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	System.out.println("Enter the element");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("enter the index which have to be delete");
	m=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(i<m)
		{
			b[i]=a[i];
		}
		else if(i==m)
		{
			continue;
		}
		else {
			b[i-1]=a[i];
		}
	}
	System .out.println("Enter the Element");
	for(int i=0;i<n-1;i++)
	{
		System.out.println(b[i]);
	}
			
}
}

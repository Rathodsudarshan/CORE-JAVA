import java.util.Scanner;

public class Smallest_number {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an Array");
	int n=sc.nextInt();
	int []a=new int[n];
	int small;
	System.out.println("Enter the element of an Array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	small=a[0];
	for(int i=0;i<n;i++)
	{
		if(small>a[i])
		{
			small=a[i];
		}
	}
	System.out.println("smallest number of an Array:-"+small);
	
}
}

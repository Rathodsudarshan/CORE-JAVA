import java.util.Scanner;
// second largest number 
public class Second_largestNumber {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n= sc.nextInt();
	int a[]= new int[n];
	System.out.println("Enter the element of an array");
	for(int i=0;i<n;i++)
	{
	   a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
			int temp=a[i]; 
			a[i]=a[j];
			a[j]=temp;
			}
		}
		
	}
	System.out.println("sencond largest number:-"+a[n-2]);
	System.out.println("second  smallest number :-"+a[1]);
	
	
	
}
}

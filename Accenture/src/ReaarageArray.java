import java.util.Scanner;

public class ReaarageArray {
  
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of array");
		int n=sc.nextInt();
		System.out.println("enter  All Element ");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
		
		int j=0;
	}
		
	}
}

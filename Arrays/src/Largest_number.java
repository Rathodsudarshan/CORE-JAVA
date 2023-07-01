import java.util.Scanner;

public class Largest_number {
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int []a=new int[n];
		int max;
		System.out.println("Enter the Element ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("largest number of an Array:-"+max);
	}
	

}

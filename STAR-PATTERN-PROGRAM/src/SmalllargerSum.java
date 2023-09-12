import java.util.Scanner;

public class SmalllargerSum {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the Array");
		int a[]=new int[n];
		int even[]=new int[n];
		int odd[]=new int[n];
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[evenCount]=a[i];
				evenCount++;
			}
			else {
				odd[oddCount]=a[i];
				oddCount++;
			}
		}
		for(int i=0;i<evenCount;i++)
		{
			System.out.print(even[i]+",");
		}
		System.out.println(" ");
		for(int i=0;i<oddCount;i++)
		{
			System.out.print(odd[i]+",");
		}
		
        int secondSmallestEven=even[0];
        int SecondSmallestOdd=odd[0];
        for(int i=0;i<even.length;i++)
        	if(secondSmallestEven)
	}

}

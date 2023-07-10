import java.util.Scanner;

public class sumOfElementPair {
	public static void main(String[]args)
	{
		int a[]= {2, 7, 4, -5, 11, 5, 20};
		int b[]= {14, -15, 9, 16, 25, 45, 12, 8};
		int n=a.length;
		int m=b.length;
				
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int x=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i]+b[j]==x)
				{
					System.out.println(a[i]+"+"+b[j]+"="+x);
				}
				
				
			}
		}
		
		}

}

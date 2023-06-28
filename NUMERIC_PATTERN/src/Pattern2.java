import java.util.Scanner;

public class Pattern2 {
	public static void main(String []args)
	
	{
		int n;
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row size:-");
		int n=sc.nextInt();*/
		
		for(int i=0;i<=4;i++)
			
		{
			 n=4;
			for(int j=1;j<n-1;j++) {
				System.out.print("");
			}
			for(int k=i;k<=i;k--)
			{
				System.out.print(k);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println("");
		}
		
	}

}

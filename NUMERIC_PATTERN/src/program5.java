import java.util.Scanner;

public class program5 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n:-");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
				
	}

}

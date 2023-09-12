import java.util.Scanner;

public class Table {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int k=i*n;
			System.out.print(k+" ");
			
			sum=sum+k;
		}
		System.out.println();
		System.out.println(sum);
		
		
	}

}

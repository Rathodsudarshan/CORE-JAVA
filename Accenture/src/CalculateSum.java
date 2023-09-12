import java.util.Scanner;

public class CalculateSum {
	public static void calculate(int m,int n)
	{
	  int temp=0;
		for(int i=m;i<=n;i++)
		{
			if(i%3==0&&i%5==0)
			{
				temp=temp+i;
			}
			/*else
			{
				System.out.println("Number is not found which is divisible by 3&5");
			}*/
		}
		System.out.println("sum of number divisible by 3&5:-"+temp);
		
	}
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the value of m:-");
		int m=sc.nextInt();
		System.out.println("enter the value of n:-");
		int n=sc.nextInt();
		calculate(m,n);
	}

}

import java.util.Scanner;

public class fibonacciSeries {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	int firstNum=0;
	int secondNum=1;
	int ThirdNum;
	for(int i=1;i<=n;i++)
	{
		ThirdNum=firstNum+secondNum;
		System.out.println(ThirdNum+"");
		firstNum=secondNum;
		secondNum=ThirdNum;
		
	}
	
}
}

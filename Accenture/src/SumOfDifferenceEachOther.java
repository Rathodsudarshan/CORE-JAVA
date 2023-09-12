import java.util.Scanner;

public class SumOfDifferenceEachOther {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		
				System.out.println("enter the value of x1:-");
		int x1=sc.nextInt();
		System.out.println("enter the value of x1:-");
		int x2=sc.nextInt();

		System.out.println("enter the value of x1:-");
		int x3=sc.nextInt();

		System.out.println("enter the value of x1:-");
		int y1=sc.nextInt();

		System.out.println("enter the value of x1:-");
		int y2=sc.nextInt();

		System.out.println("enter the value of x1:-");
		int y3=sc.nextInt();

		int sum=0;
		int p=2;
		
		sum+=sqrt((pow(x2-x1, p))+pow((y2-y1), p));
		sum+=sqrt((pow(x3-x2, p))+pow((y3-y2), p));
		sum+=sqrt((pow(x1-x3, p))+pow((y1-y3), p));
		
		System.out.println(sum);

		
	}

	private static int pow(int i, int p) {
		// TODO Auto-generated method stub
		return 0;
	}


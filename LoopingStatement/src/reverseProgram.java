import java.util.Scanner;

public class reverseProgram {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the number here!");
		int rev=0;
			int n=sc.nextInt();
		int temp=n;
		int rem=0;
		while(temp>0)
		{
			 rem=temp%10;
			 rev=rev*10+rem;
			temp/=10;
		}
		System.out.println("the number is"+n+"is reverse"+rev);
		
		
	}

}

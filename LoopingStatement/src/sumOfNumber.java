import java.util.Scanner;

public class sumOfNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
			System.out.print("Enter the value of n");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum+=1/i;
	}
	System.out.println("sum of the number :-"+sum);
}
}

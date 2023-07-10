import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String []args)
	{
		int n;
		int evenSum=0;
		int oddSum=0;
		char choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your number ");
			n=sc.nextInt();
			if(n%2==0) {
				evenSum+=n;
			}
			else 
			{
				oddSum+=n;
			}
			
		
       System.out.println("Do you want to continue");
       choice = sc.next().charAt(0);
		}while(choice=='y'||choice=='y');
		
			System.out.println("sum of Even number :-"+evenSum);
			System.out.println("sum of Odd number:-"+oddSum);
			
		
        
	}

}

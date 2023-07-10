import java.util.Scanner;

public class countingNumber {
	public static void main(String []args)
	{
		Scanner sc= new Scanner( System.in);
		char choice;
		int positiveNum=0;
		int negativeNum=0;
		do {
			System.out.println("enter the number :-")	;
			int n=sc.nextInt();
			if(n>0)
			{
				positiveNum++;
			}
			else {
				negativeNum++;
			}
			
			System.out.println("do you want contnue :-");
			choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='y');
		System.out.println("positive number is present in that number:-"+positiveNum);
		System.out.println("NegativeNumber is present in that number :-"+negativeNum);
		
	}

}

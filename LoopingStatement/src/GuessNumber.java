import java.util.Scanner;

public class GuessNumber {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
		int n,
	
		guess,
		tries=0;
		n=(int)(Math.random()*100)+1;
		System.out.println("guess the number Game");
		System.out.println();
		do {
			System.out.println("Guess the number between 1 to 100");
			guess=sc.nextInt();
			tries++;
			
			if(guess>n)
			{
				System.out.println("NUmber is to High");
			}
			else if(guess<n)
			{
				System.out.println("Number is to low");
			}
			
			else {
				System.out.println("Correct! you got in it"+tries+"guess");
			}
		}while(guess!=n);
}
}

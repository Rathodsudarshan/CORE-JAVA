import java.util.Scanner;

public class Number_of_days {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number:-");
		int mon;
		int days=0;
		mon=sc.nextInt();
		
		switch(mon)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of day is 31....");
			break;
		case 4:
		case 6:
		case 9:
		case 11:	
			System.out.println("Number of day is 30....");
			break;
		case 2:
			System.out.println("Number of day is 28");
		default:
			System.out.printf("Invalid...Please Enter the 1 to 12...");
			break;
			
		}
	}

}

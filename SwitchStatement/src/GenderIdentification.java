import java.util.Scanner;

public class GenderIdentification {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the the character to decide gender");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'm':
		case 'M':
			System.out.println("male");
			break;
			
		case 'f':
		case 'F':
			System.out.println("female");
			break;
			
			default:
				System.out.println("unsaticfied case");
				
		}
		
	}

}

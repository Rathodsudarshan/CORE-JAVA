import java.util.Scanner;

public class fuction {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value of A:-");
		int a=sc.nextInt();
		System.out.println("enter value of B:-");
		int b=sc.nextInt();
	    System.out.println("enter value of c:-");
		int c=sc.nextInt();
		
		switch(c)
		{
			
			case 1:
				int op=a+b;
				System.out.println("output:-"+op);
				
			case 2:
				int op2=a-b;
				System.out.println("output:-"+op2);
				
			case 3:
				int op3=a*b;
				System.out.println("output:-"+op3);
				
			case 4:
				int op4=a+b;
				System.out.println("output:-"+op4);
		}
	}
			
		
	
}

import java.util.Scanner;

public class program6 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size:-");
		int row=sc.nextInt();
		for(int i=row;i>=1;i--)
		{
			for(int j=row;j>i;j--) {
				System.out.print("");
				
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*"+"");
			}
			System.out.println("");
		}
	}

}

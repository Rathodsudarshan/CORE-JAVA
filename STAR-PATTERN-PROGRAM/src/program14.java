import java.util.Scanner;

public class program14 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the row size here:-");
		int rows=sc.nextInt();
		for(int i=0;i<=rows;i++)
		{
			for(int j=1;j<rows;j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == rows || k==(2*i-1)) {
                    System.out.print("*");
                }else {
                	System.out.print(" ");
                }
                
			}
			System.out.println(" ");
	}
		}

}

import java.util.Scanner;

public class program4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:-");
				int n=sc.nextInt();
				for(int i=n;i>=1;i--)
				{
					for(int j=n;j>=i;j--)
					{
						System.out.print(j+" ");
					}
					System.out.println("");
				}
				
	}

}

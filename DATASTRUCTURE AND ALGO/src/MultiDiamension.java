import java.util.Scanner;

public class MultiDiamension {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
			System.out.println("enter the row size");
	int r=sc.nextInt();
	System.out.println("Enter the size of col");
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	System.out.println("Enter the all the element");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	
}
}

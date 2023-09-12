import java.util.Scanner;

public class AddToMatrix {
public static void main(String []args)
{
	int m,n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	m=sc.nextInt();
	System.out.println("Enter the value of columns");
	n=sc.nextInt();
	int array1[][]=new int[m][n];
	int array2[][]=new int[m][n];
	int sum[][]=new int[m][n];
	System.out.println("enter the first matrix element");
	for(i=0;i<m;i++)
	{
		for ( j=0;j<n;j++)
		{
			array1[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("enter the first matrix element");
	for( i=0;i<m;i++)
	{
		for ( j=0;j<n;j++)
		{
			array2[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("sum of matrix element");
	for( i=0;i<m;i++)
	{
		for ( j=0;j<n;j++)
		{
			sum[i][j]=array1[i][j]+array2[i][j];
			
		}
	}
	for(i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
			System.out.print(sum[i][j]+"\t");
			System.out.println();
		}
}}
}

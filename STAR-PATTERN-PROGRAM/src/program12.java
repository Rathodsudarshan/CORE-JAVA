import java.util.Scanner;

//Left pascals tringle
public class program12 {
public static void first()
{
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the row size here");
    int row =sc.nextInt();
    for(int i=1;i<=row;i++)
    {
    	for(int j=i;j<row;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println("");
    }
    for(int i=row;i>=1;i--)
    {
    	for(int j=i;j<row;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    	
    }
}
    public static void second()
    {
    	Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row size here");
        int row =sc.nextInt();
    for(int i=1;i<=row;i++)
    {
    	for(int j=i;j<row;j++)
    	{
    		System.out.print("");
    	}
    	for(int k=1;k<=i;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println("");
    }
    for(int i=row;i>=1;i--)
    {
    	for(int j=i;j<row;j++)
    	{
    		System.out.print("");
    	}
    	for(int k=1;k<=i;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    }
    public static void main(String []args)
    {
    	first();
    	second();
    }
    
	
	

}

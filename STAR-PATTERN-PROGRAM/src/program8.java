import java.util.Scanner;

public class program8 {
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the n size :-");
       int n=sc.nextInt();
      int  space=n-1;
       for(int i=1;i<=n;i++)
       {
    	   for(int j=1;j<=space;j++)
    	   {
    		   System.out.print(" ");
    	   }
    	   space--;
    	   for(int k=1;k<=2*i-1;k++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println(" ");
       }
       space=1;
       for(int i=1;i<=n-1;i++)
       {
    	   for(int j=1;j<=space;j++)
    	   {
    		   System.out.print("");
    	   }
    	   space++;
    	   for(int k=1;k<=2*(n-i)-1;k++) {
    		   System.out.print("*");
    	   }
    	   System.out.println("");
       }
       
		
       }

}

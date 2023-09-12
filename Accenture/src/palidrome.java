import java.util.Scanner;

public class palidrome {
	public static int palidro(int n)
	{
		int rem=0;
		int temp=n;
		while(temp!=0)
		{
			int r=temp%10;
			rem=(rem*10)+r;
			temp=temp/10;
			
		}
		return rem;
	}
   public static void main(String []args)
   {
	   Scanner sc= new Scanner(System.in);
			   System.out.print("Enter th lower lin=mit and upper limit");
	   int ul=sc.nextInt();
	   int ll=sc.nextInt();
	    for(int i=ul;i<=ll;i++)
	    {
	    	if(i==palidro(i))
	    	{
	    		System.out.print(i+",");
	    	}
	    }
	   }
}

import java.util.ArrayList;
import java.util.Scanner;

public class decodeNbase {
	
	public static String dectoBase(int n,int num)
	{
		String res="";
		int quotient=num/n;
		ArrayList<Integer> rem=new ArrayList <Integer>();
		rem.add(num%n);
		while(quotient!=0)
		{
			rem.add(quotient%n);
			quotient=quotient/n;
		}
		for(int i=0;i<rem.size();i++)
		{
			if(rem.get(i)>9)
			{
				res=((char)(rem.get(i)-9+64)+res);
				
			}
			else {
				res=rem.get(i)+res;
			}
		}
		return res;
			
		
	}
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of num");
		int num=sc.nextInt();
		System.out.print(dectoBase(n,num));
	}

}

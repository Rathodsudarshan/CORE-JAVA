import java.util.Scanner;

public class MoveHypen {
	public static String MoveHypen(String str,int n)
	{
		String res="";
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='-')
			{
				res=str.charAt(i)+res;
			}
			else
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
 public static void main(String[]args)
 {
	Scanner sc= new Scanner(System.in);
	String str=sc.next();
	System.out.println(MoveHypen(str,str.length()));
	
 }
}

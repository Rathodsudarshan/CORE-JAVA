package STRING;

public class palidromDeletion {
	public static int minDelection(String s)
	{
		int deletion=0;
		int n=s.length();
		for(int i=0,j=n-1;i<j;)
		{
			if(s.charAt(i)==s.charAt(j))
			{
			i++;
			j--;
			}
			else if(s.charAt(i+1)==s.charAt(j))
			{
				i++;
			}
			else if(s.charAt(i)==s.charAt(j-1))
			{
				j--;
			}
		 deletion++;
	}
	return deletion;
	}
public static void main(String []args)
{
	String s="aebcbda";
	System.out.println("output for"+s+"miniDeletion to make String palidrome"+minDelection(s));
}
}

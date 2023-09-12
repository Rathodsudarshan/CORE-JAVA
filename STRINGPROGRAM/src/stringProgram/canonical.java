package stringProgram;

public class canonical {
public static void main(String []args)
{
	String str="java xercise";
	StringBuffer str1=new StringBuffer("java").append("Exercise");
	String str3=str1.intern();
	System.out.println("str==str1"+(str==str1));
	System.out.println("str==str1"+(str1==str3));
	
}
}

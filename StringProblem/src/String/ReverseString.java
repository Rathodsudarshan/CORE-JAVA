package String;

public class ReverseString {
	public static void reverse(String str)
	{
		int n=str.length();
		char temp;
		char[]ch=str.toCharArray();
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
		}
		System.out.println(ch);
	}
	public static void main(String[]args)
	{
		String str="geeksforgeeks";
		reverse(str);
		
	}

}

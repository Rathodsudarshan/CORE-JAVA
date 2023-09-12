package STRING;

public class MinDistance {
	public static int DistanceBetween(String str[],String word1,String word2)
	{
		int d1=-1;
		int d2=-1;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==word1)
			{
				d1=i;
			}
			if(str[i]==word2)
			{
				d2=i;
			}
			if(d1!=-1 &&d2!=-1)
			{
				ans=Math.min(ans, Math.abs(d1-d2));
			}
		}
		return ans;
	}
	public static void main(String[]args)
	{
		String []str={"the", "quick", "brown", "fox", "quick"};
		System.out.println(DistanceBetween(str,"the","brown"));
	}

}

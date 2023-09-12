package STRING;

public class prefix {
	
	static int findMinlength(String arr[],int n)
	{
		int min=arr[0].length();
		for(int i=0;i<n;i++)
		{
			if(arr[i].length()<min)
			{
				min=arr[i].length();
			}
		}
		return (min);
		
	}
		public static String commonPrefix(String arr[],int n)
		{
			int minlen=findMinlength(arr,n);
					String result="";
			char current;
			for(int i=0;i<minlen;i++)
			{
				current=arr[0].charAt(i);
				
				for(int j=1;j<n;j++)
				{
					if(arr[j].charAt(i)!=current)
					{
						return result;
					}
				}
				result +=(current);
			}
			return(result);
			
		
	}
	
	public static void main(String[]args)
	{
		String arr[]= {"geeksforhgeeks","geeks","geek","geezer"};
		int n=arr.length;
		
		String ans=commonPrefix(arr,n);	
		if(ans.length()>0)
		{
			System.out.println("the longest common prefix is :-"+ans);
			
		}
		else {
			System.out.println("there is no common prefix");
		}
		
	}

}

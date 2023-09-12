
public class movezeroAtend {
	public static void main(String []args)
	{
		int []arr= {0,2,0,3,0,4,0,5};
		int []newarr=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				newarr[j]=arr[i];
				j++;
				
			}
		}
		while(j<newarr.length)
		{
			newarr[j]=0;
			j++;
		}
		System.out.println
		("After moving zero");
		for(int n:arr)
		{
			System.out.print(n+",");
		}
		System.out.println();
		for(int m :newarr)
		{
			System.out.print(m+",");
		}
			
	}

}

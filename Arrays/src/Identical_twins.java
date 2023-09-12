
public class Identical_twins {
	
	public static void main(String []args)
	{
		int a[]= {1,2,1,2,3,3,4,5,4};
		int n=a.length;
		int twins=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					twins++;
				}
			}
		}
		System.out.println(twins);
	}

}

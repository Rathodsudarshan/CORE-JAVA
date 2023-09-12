
public class cumulative_sum {
	public static void main(String[]args)
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			a[i]=sum;
			
		}
		for(int i=0;i<n;i++) {
		System.out.print(a[i]+",");
		}
	}

}


public class missingnumber {
	public static void main(String args[])
	{
		int []number = {1,2,3,4,5,7,6,9};
		int total_num=9;
		int sum=total_num*((total_num+1)/2);
		int num_sum=0;
		for(int i:number)
		{
			num_sum+=i;
		}
		System.out.println(sum-num_sum);
		
	}

}

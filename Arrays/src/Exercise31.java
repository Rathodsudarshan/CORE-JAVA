
public class Exercise31 {
	public static void main(String[]args)
	{
		int []arr= {10,77,10,54,-11,10};
		int digit=10;
		int sum=30;
		System.out.println("result:-"+result(arr,digit,sum));
	}
	public static boolean result(int []arr,int num,int sum)
	{
		int temp_sum=0;
		for(int n:arr)
		{
			if(n==num)
			{
				temp_sum+=n;
			}
			
				
		
		if(temp_sum>sum)
		{
			break;
		}
		}
		return temp_sum==sum;
		
	}

}

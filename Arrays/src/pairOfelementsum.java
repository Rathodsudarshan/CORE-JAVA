
public class pairOfelementsum {
		public static void pair_num(int[]num,int number)
		{
			for(int i=0;i<num.length;i++)
			{
				for (int j=i+1;j<num.length;j++)
				{
					if(num[i]+num[j]==15)
					{
						System.out.println(num[i]+"+"+num[j]+"="+"number");
				}
			}
		}
		
	}
	public static void main(String []args)
	{
		int []num= {2,7,4,-5,11,5,20};
		pair_num(num,15);
		
	}

}


public class defferenceofSum {
	public static void main(String []args)
	{
		int m=6;
		int n=30;
		int sumOfM=0;
		int sumOfN=0;
	for(int i=1;i<=n;i++)
		{
		if(i%m!=0)
		{
			sumOfM+=i;
		}
		else {
			sumOfN+=i;
		}
			
		}
	System.out.println("sumOfM:-"+sumOfM);
	System.out.println("sumOfN:-"+sumOfN);
	System.out.println("sum of difference:-"+(sumOfM-sumOfN));
		
	}

}

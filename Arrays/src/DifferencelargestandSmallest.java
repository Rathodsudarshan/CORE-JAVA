
public class DifferencelargestandSmallest {
	public static void main(String args[])
	{
		int []arr= {5,7,2,4,9};
		int max=arr[0];
		int min_value=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min_value)
				min_value=arr[i];
			
		
		}
		System.out.println("Difference between largest and smallest:-"+(max-min_value));
	}
	

}

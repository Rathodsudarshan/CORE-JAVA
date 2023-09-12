
public class averageofvalue {
	public static void main(String[]args)
	{
		int arr[]= {5,7,2,4,9};
		int max=arr[0];
		int min=arr[0];
		float sum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<max)
			{
				min=arr[i];
			}
		}
		float average=((sum-max-min)/(arr.length)) ;
		System.out.println("average of value of an array except largets and smallest value:-+"+average);
	}

}

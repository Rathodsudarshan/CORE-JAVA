
public class ThirdLargestNumber {
	
	public static int LargestNumber(int arr[],int index)
	{
		int temp=0;
		for(int i=0;i<index;i++) {
			for(int j=0;j<index;j++) {
				if(arr[i]>arr[j]) {
					   temp = arr[i];  
	                    arr[i] = arr[j];  
	                    arr[j] = temp;  
					
				}
				 
			}
		}
		return arr[index-3];
	}
public static void main(String[]args)
{
	int arr[]= {1,3,4,5,2};
	System.out.println("Third Largest: "+LargestNumber(arr,5));
			
	
	
}
}

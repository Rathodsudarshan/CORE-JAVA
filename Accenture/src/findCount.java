import java.util.Scanner;

public class findCount {
	public static int countNUmber(int arr[],int n,int num,int diff)
	{int count=0;
		for(int i=0;i<n;i++)
		{
			if(Math.abs(num-arr[i])<=diff)
			{
				count++;
			}
		}
		return count>0? count:-1;
		
	}
	public static void main(String[]args)
	{
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the Num");
		int num=sc.nextInt();
		System.out.println("Enter the diff:-");
		int diff=sc.nextInt();
		System.out.println(" number lies between "+ countNUmber(arr,n,num,diff));
	}

}

import java.util.Scanner;

public class Ratunit {
	public static int solve(int r,int unit,int arr[],int n)
	{
		if(arr==null)
		{
			return -1;
		}
		int res=r*unit;
		int sum=0;
		int count=0;
		for (int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			count++;
			if(sum>=res)
			{
				break;
			}
			
		}
		if(sum<res)
		{
			count++;
			System.out.println("Insufficient food to fulfilled the rat requirement");
		}
		return count;
	}
	public static void main(String []arga)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the value of  r:-");
		int r=sc.nextInt();
		System.out.println("enter the value of  unit:-");
		int unit=sc.nextInt();
		System.out.println("enter the value of  n:-");
		int n=sc.nextInt();
		System.out.println("enter All element:-");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		System.out.println(solve(r,unit,arr,n));
	}

}

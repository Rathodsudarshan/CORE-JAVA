import java.util.Scanner;

public class Pullnegative_number {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int []a=new int[n];
		int j=0,temp;
		System.out.println("Enter the all the element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			
			if(a[i]<0) {
				
				
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				j++;
			}
		}
		for(j=0;j<n;j++)
		{
			System.out.println(a[j]);
		}
	}

}

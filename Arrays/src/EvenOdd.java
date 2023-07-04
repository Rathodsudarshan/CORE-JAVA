import java.util.Scanner;

public class EvenOdd {
	public static void main(String[]args)
	{
		int j=0,k=0;
		Scanner sc=new Scanner(System.in) ;
			System.out.println("Enter the size of the array");
			int n=sc.nextInt();
			int []a=new int [n];
			int []Even=new int [n];
			int []Odd=new int [n];
			System.out.println("Enter the all the elememnt");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]%2!=0) {
					Odd[j]=a[i];
					j++;
				}
				else {
					Even[k]=a[i];
					k++;
				}
			}
			System.out.println("Odd");
			if(j>1)
			{
			for(int i=0;i<(j-1);i++)
			{
				System.out.print(Odd[i]+",");
			}
			System.out.print(Odd[j-1]);
			}
			else {
				System.out.print("NO NUMBER");
			}
			
		
	
	System.out.println("Even");
	if(k>1)
	{
	for(int i=0;i<(k-1);i++)
	{
		System.out.println(Even[i]+",");
	}
	//System.out.print(Even[k-1]);
	}
	else {
		System.out.println("NO NUMBER");
	}
	}

}

import java.util.Scanner;

public class AcendingOrder {
	public static void main(String []args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of an array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the all the element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j]) 
					{
						 temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for( i=0;i<n;i++) {
			System.out.print(a[i]+",");}
		}
	}

}

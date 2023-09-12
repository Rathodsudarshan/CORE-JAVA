import java.util.Scanner;
//To identify the even position number
public class EvenPosition {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+",");
			}
		}
				
	}

}

import java.util.Scanner;

public class Deleting_element {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n-1];
		System.out.println("Enter all the Element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the index of new value");
		int index=sc.nextInt();
		
		for(int i=0;i<a.length;i++) //10 20 30 40 50 
		{
			if(i<index)     //10 20 80 30
			{
				b[i]=a[i];
			}
			else if(i==index)
			{
				continue;
			}
			else {
				b[i-1]=a[i];
			}
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(b[i]);
		}
	}

}

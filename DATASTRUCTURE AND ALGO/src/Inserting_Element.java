import java.util.Scanner;

public class Inserting_Element {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n+1];
		System.out.println("Enter all the Element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the index of new value");
		int index=sc.nextInt();
		System.out.println("Enter the element ");
		int element=sc.nextInt();
		
		for(int i=0;i<n+1;i++) //10 20 30 40 50 
		{
			if(i<index)     //10 20 80 30
			{
				b[i]=a[i];
			}
			else if(i==index)
			{
				b[i]=element;
			}
			else {
				b[i]=a[i-1];
			}
		}
		for(int i=0;i<n+1;i++) {
			System.out.println(b[i]);
		}
	}

}

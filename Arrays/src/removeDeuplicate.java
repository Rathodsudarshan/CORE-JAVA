import java.lang.reflect.Array;
import java.util.Scanner;

public class removeDeuplicate {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an Array:-");
		int n= sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the all the element :-");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(a[j+1]!=a[i]) {
					break;
				}
				
				else if(a[j+1]==a[i]) {
					a[j+1]=a[i];
					System.out.print(a[i]+",");
				}
			}
		}
		
		
	}
	
}

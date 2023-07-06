import java.util.Scanner;

public class SumOfArray {
public static void main(String[]args) {
	int sum = 0;
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter all the element of Array");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<n;i++) {
		 sum +=a[i];
	}
	System.out.println(sum);
}
}

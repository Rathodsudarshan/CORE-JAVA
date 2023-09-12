import java.util.Scanner;

public class Traversing_array {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter all the Element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}

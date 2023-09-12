import java.util.Scanner;

public class insert {
	public static void main(String []args)
	{
		int  i ,n,pos,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		 n=sc.nextInt();
		  
		 int []a=new int[n+1];
		 System.out.println("Enter the array element");
		 for( i=0;i<n;i++) 
		 {
			 a[i]=sc.nextInt();
			 
		 }
		 System.out.println("enter the position of the Element");
		 pos=sc.nextInt();
		 
		 System.out.println("Enter the value which have to insert ");
		 x=sc.nextInt();
		 
		 for( i=(n-1);i>(pos-1);i--);
		 {
			 a[i+1]=a[i];
		 }
		 a[pos-1]=x;
				 
		 System.out.println("After inserrting");
		 for( i=0;i<n;i++) {
			 System.out.print(a[i]+",");
		 }
		 System.out.print(a[n]);
		
		
	}

}

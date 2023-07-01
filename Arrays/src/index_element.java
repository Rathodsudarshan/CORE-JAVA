import java.util.Scanner;

public class index_element {
	public static int indexof(int []arr,int item) {
		for(int i=0;i<arr.length;i++) {
			 
			System.out.print(arr[i]+"");
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int []arr=new int[n];
		System.out.println("Enter the element of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element which we want to find");
		int item=sc.nextInt();
		int index=indexof(arr,item);
		if(index!=-1) {
			System.out.println("the element is  "+item+"it's index is "+index);
		}
		else {
			System.out.println("the element is"+item+"not present in this array");
			
		}
	}

}

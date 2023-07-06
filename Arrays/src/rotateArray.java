import java.util.Scanner;

public class rotateArray {
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in );
		int i,n,x;
				System.out.println("Enter the size of Array ");
				int n=sc.nextInt();
				
				int[]array=new int[n];
				System.out.println("Enter all the element");
				for( i=0;i<n;i++) {
					array[i]=sc.nextInt();
				}
				 x=3;
				System.out.println("Original Array");
				for( i=0;i<array.length;i++) {
					System.out.println(array[i]+",");
				}
				
				  for(int i = 0; i < n; i++){  
			            int j, first;  
			           
			            first = array[0];  
			            for(j = 0; j < array.length-1; j++){  
			               
			                array[j] = array[j+1];  
			            }  
			            
			            array[j] = first;  
			        } 
				  System.out.println();  
			        //Displays resulting array after rotation  
			        System.out.println("Array after left rotation: ");  
			        for(int i = 0; i< array.length; i++){  
			            System.out.print(array[i] + " ");  
	}

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EvenOddSecond {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int []arr=new int[n];
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println("sorted array");
		for(int e:even)
		{
			System.out.print(e+",");
		}
		System.out.println();
		for(int e:odd)
		{
			System.out.print(e+",");
		}
		
		int evensecond=even.get(even.size()-2);
		int oddsecond=odd.get(odd.size()-2);
		System.out.println("");
		int sum=evensecond+oddsecond;
		System.out.println("sum of"+sum);
	}

}

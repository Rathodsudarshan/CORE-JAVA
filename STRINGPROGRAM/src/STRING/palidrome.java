package STRING;

import java.util.Scanner;

public class palidrome {
	public static boolean ispalidrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter String ");
		String str=scanner.nextLine();
		
		if(ispalidrome(str)) {
			System.out.println("Given String is palidrome");
		}
		else {
			System.out.println("Given String is  not palidrome");
		}
	}

}


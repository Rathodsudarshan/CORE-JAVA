package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramchecker {
	public static boolean anagram(String str1,String str2) {
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s","").toLowerCase();
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char []charArray1=str1.toCharArray();
		char[]charArray2=str2.toCharArray();
		
		return Arrays.equals(charArray1,charArray2);
	}
 public static void main(String []args) {
	 Scanner sc=new Scanner(System.in);
	 System .out.println("Enter your first String");
	 String str1=sc.nextLine();
	 Scanner sc1=new Scanner(System.in);
	 System .out.println("Enter your second String");
	 String str2=sc1.nextLine();
	 
	
	 if(anagram(str1,str2)) {
		 System.out.println("the given String "+str1+" is anagram");
	 }
	 else {
		 System.out.println("the given string "+str2+" is not anagram");
	 }
 }
}

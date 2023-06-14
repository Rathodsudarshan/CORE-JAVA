package STRING;

import java.util.Scanner;

public class WordAnlyzer {
	private static final String Largestword = null;

	public static void main(String []args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		
		String[] word=str.split(" ");
		String Smallword=word[0];
		String Largestword=word[0];
		for(int i=1;i<word.length;i++) {
			if(word[i].length()<Smallword.length())
			{
				Smallword=word[i];
			}
			if(word[i].length()>Largestword.length()) {
				Largestword=word[i];
			}
		}
		
		System.out.println("smallestword:-"+Smallword);
		System.out.println("largestword:-"+Largestword);
	}

}

package STRING;

public class checkword {




	public static boolean checkWord(String str,String word)
	{
		str=str.toLowerCase();
		word=word.toLowerCase();/*String.contains() is a built-in method in Java that is used to check
		                         if a specific sequence of characters (substring) 
		                          is present within a given string.*/
		
		return str.contains(word);//
	}
	public static void main(String[]args) {
		String str="orange color is best color";
		String word="orange";
		if(checkWord(str,word))
		{
			System.out.println("the "+word+"is present in this sentence");
		}
		else {
			System.out.println("the "+word+"is not  present in this sentence");
			
		}
	}

}







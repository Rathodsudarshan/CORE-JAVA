package STRING;

public class reverseWord {

	public static  String reverWord(String str) {
		String []word=str.split("\\.");
				StringBuilder reverse= new StringBuilder();
		for(int i =word.length-1;i>=0;i--)
		{
			reverse.append(word[i]);
			
		
		if(i!=0) {
			reverse.append(".");
		}
		}
	
	return reverse.toString();
	}
	public static void main (String []args) {
		String str="pqr.mno";
		String reversedWord=reverWord(str);
		System.out.println("ReversedWord:-"+str);
	}
}



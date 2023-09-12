package stringProgram;

public class lexicographically {
	public static void main(String []args) {
		String str1="Leetcode";
		String str2="Leetcode";
		System.out.println("original str1:-"+str1);
		System.out.println("oroginal String-"+str2);
		
		int result=str1.compareTo(str2);//Compare the two strings.
        //int result = str1.compareToIgnoreCase(str2);

		if(result<0)
		{
			System.out.println("str1 length is smaller than than str2");
			
		}
		else if(result==0)
		{
			System.out.println("str1 is equla to str2");
			
		}
		else {
			System .out.println("Str1 is great than str2");
		}
	}
	

}

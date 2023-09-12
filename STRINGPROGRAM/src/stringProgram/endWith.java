package stringProgram;

public class endWith {
	public static void main(String[]args)
	{
		String str1="java Exercises";
		String str2="java exercise";
		String end_str="se";
		boolean end1=str1.endsWith(end_str);
		boolean end2=str2.endsWith(end_str);
		
		System.out.println("str1 is end with "+end1);
		System.out.println("str1 is end with "+end2);
	}

}

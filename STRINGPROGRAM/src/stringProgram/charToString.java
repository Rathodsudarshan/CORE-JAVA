package stringProgram;

public class charToString {
	public static void main(String[]args)
	{
		char[]arr_num=new char[] {'1','2','4','5'};
		String str=String.copyValueOf(arr_num,1,3);
		System.out.println("the books contain "+str+"pages");
	}

}

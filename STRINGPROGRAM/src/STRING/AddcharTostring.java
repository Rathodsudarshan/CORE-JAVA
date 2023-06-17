package STRING;
//using SubString method for Add character to String 

public class AddcharTostring {
	public static String addChar(String str,char c,int pos) {
		
		return str.substring(0, pos)+c
				+str.substring(pos);
		
	}
	public static void main(String []args)
	{
		String str="shr ram ";
		char c='i';
		String addStr=addChar(str,c,3);
		System.out.println(addStr);
	}
}

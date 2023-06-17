package STRING;

public class REPLACEWORD {
	public static String replace(String sen,String oldsen,String newsen) {
		
	
	String result=sen.replace(oldsen,newsen);
	return result;
}
	public static void main(String []args) {
		String sen="batman with bat";
		String oldsen="bat";
		String newsen="snow";
		String replaceword=replace(sen,oldsen,newsen);
		System.out.println("sentence:-"+sen);
		System.out.println("replaceSentence;-"+replaceword);
	}
	

}

package stringProgram;
/*Unicode system is an international
 *  character encoding technique that
 *   can represent most of the languages around the world.
 *   Hexadecimal values are used to represent unicode characters
 */

public class UnicodeString1 {
	public static void main(String []args) {
		String str="leetcode";
		System.out.println("original String"+str);
		int var1=str.codePointAt(1);
		int var2=str.codePointAt(4);
		System.out.println("character (unicode point)="+var1);
		System.out.println("character(unicode point)="+var2);
		
	}

}

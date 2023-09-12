import java.util.Scanner;

public class checkPassword {
 public static int passwordcheck(String str,int n)
 {
	 if(n<4)
	 {
		 return 0;
	 }
	 if (str.charAt(0)>=0||str.charAt(0)<=9)
	 {
		 return 0;
	 }
	 int num=0,cap=0;
	 for(int i=0;i<=str.length();i++)
	 {
		 if(str.charAt(i)==' '||str.charAt(i)=='/')
		 {
			 return 0;
		 }
		 if(str.charAt(i)>='A'&& str.charAt(i)<='z')
		 {
			 cap++;
		 }
		 if(str.charAt(i)>=0&& str.charAt(i)<=9)
		 {
			 num++;
		 }
		 
	 }
	 if(num>0&&cap>0)
	 {
		 return 1;
	 }
	 else {
		 return 0;
	 }
 }
 public static void main(String []args)
 {int n;
	do { Scanner sc= new Scanner (System.in);
			 String str=sc.next();
	 System.out.println(passwordcheck( str, str.length()));
	 System.out.println("Do u want to run this program repeat");
	 n=sc.nextInt();
	 }while(n==1);
 }
}

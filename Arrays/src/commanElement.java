
public class commanElement {
	public static void main(String[]args)
	{
		int count=0;
	 String a[]= {"java","python","PHP","css"};
	 String b[]= {"javaScript","python","PHP","css"};
	 String c[]=new String[4];
	 for(int i=0;i<4;i++)
	 {
		 for(int j=0;j<4;j++)
		 {
			 if(a[i]==b[j])
			 {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				count++;
				 System.out.print(temp+",");
				 
			 }
			
			
			 
			 
		 }
		 
	 }
	 System.out.println(count);
	
	 
	}
}

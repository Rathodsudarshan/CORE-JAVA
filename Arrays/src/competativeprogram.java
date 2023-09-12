
public class competativeprogram {
	public static void main(String []args) {
		String col[]= {"red","blue","green","red","blue","green","red","blue","green"};
		int n=col.length;
		String temp;
		for(int i=0;i<n;i++)
		{
			if(col[i]=="red") {
				 temp=col[i];
				col[i]=temp;
			}
			else if(col[i]=="green")
			{
				temp=col[i];
				col[i]=temp;
				
				
			}
			else if(col[i]=="blue") {
				 temp=col[i];
				col[i]=temp;
				System.out.print(temp);
			}
			}
			
		
		
	}

}

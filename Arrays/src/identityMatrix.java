
public class identityMatrix {
	public static void main(String []args)
	{
		int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag=true;
		int row=a.length;
		int col=a[0].length;
		
		if(row!=col) {
			System.out.println("matrix should be square ");
			
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
				
				if(i==j&&a[i][j]!=1)
				{
					flag=false;
					break;
				}
				if(i!=j&&a[i][j]==1)
				{
					flag=false;
					break;
				}
				
			}
			
		}
		if(flag)
		{
			System.out.println("Given matrix is an indentity matrix");
		}
		else {
			System.out.println("given matrix is not an identity matrix");
		}
	}

}

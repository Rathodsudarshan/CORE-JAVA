
public class SumOfRowandCol {
	public static void main(String[]args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row=a.length;
		int col=a[0].length;
		int sumRow;
		int sumCol;
		for(int i=0;i<row;i++)
		{
			sumRow=0;
			for(int j=0;j<col;j++)
			{
				sumRow=sumRow+a[i][j];
				
			}
			System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
		}
		for(int i=0;i<row;i++)
		{
			sumCol=0;
			for(int j=0;j<col;j++)
			{
				sumCol=sumCol+a[i][j];
			}
			System.out.println("Sum of " + (i+1) +"col: " + sumCol);    
		}
		
		
	}

}

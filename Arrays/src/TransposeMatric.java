
public class TransposeMatric {
public static void main(String []args)
{
	int transpose[][]=new int[3][3];
	int a[][]= {{1,2,3} ,{4,5,6},{7,8,9}};
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			transpose[i][j]=a[j][i];
			
		}
		
	}
	for(int i=0;i<3;i++)
		for(int j=0;j<3;j++) {
			System.out.print(a[i][j]+",");
			
		}
	System.out.println("");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			System.out.print(transpose[i][j]+",");
		}
	}
}
}

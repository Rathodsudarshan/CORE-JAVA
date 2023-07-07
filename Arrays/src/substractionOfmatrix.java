
public class substractionOfmatrix {
	public static void main(String[]args) {
		
	int a[][]= {{1,2,3},{3,4,5},{5,6,7}};
	int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
	int diff[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			diff[i][j]=a[i][j]-b[i][j];
			
			
		}
		
	}
	System.out.println("");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			
			System.out.print(diff[i][j]+",");
		}
	}
	
	}

}

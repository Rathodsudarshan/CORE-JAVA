
public class productOfmatrix {
public static void main(String[]args)
{
    int a[][] = {    
            {1, 3, 2},    
            {3, 1, 1},    
            {1, 2, 2}    
         };    

    
int b[][] = {    
            {2, 1, 1},    
           {1, 0, 1},    
           {1, 3, 1}    
       };
   
int p[][]=new int[3][3];

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		for(int k=0;k<3;k++)
		{
			p[i][j]=p[i][j]+a[i][k]*b[k][j];
		}
	}
}
for(int i=0;i<3 ;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(p[i][j]+" ,");
	}
	System.out.println(" ");
}


}
}

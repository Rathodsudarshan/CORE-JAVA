import java.util.Scanner;

public class program6 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter thr value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			
				int num=0;
				if(i%2==0)
				{
					for(int j=1;j<=n;j++)
					{
					System.out.print(num);
					num=(num==0)?1:0;
					}
				}
				else  {
					num=1;
					for(int j=1;j<=n;j++)
					{
					System.out.print(num);
					num=(num==0)?1:0;
					
				}
			}
			System.out.println("");
		}
	}

}

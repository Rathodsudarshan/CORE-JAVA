
public class frequencyEvenOdd {
public static void main(String []args)
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int row=a.length;
	int col=a[0].length;
	int countEven=0;
	int countOdd=0;
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			if(a[i][j]%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
	}
	System.out.println("Even:-"+countEven);
	System.out.println("odd:-"+countOdd);
	
	}
}


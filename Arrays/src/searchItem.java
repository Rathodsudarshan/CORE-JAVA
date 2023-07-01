
public class searchItem {
public static boolean contain(int []arr,int item) {
	for(int n:arr)
	{
		if(item==n)
		{
			return true;
		}
	}
	return false;
	
}

public static void main(String []args)
{
	int []my_arr= {2013,2014,122,45,678,88,765,33,45,6788,};
	System.out.println(contain(my_arr,45));
	
}
}

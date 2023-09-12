import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylist {
public static void main(String[]args)
{
	String []my_array= {"Python","java","php","perl"};
	ArrayList<String>list=new ArrayList<String>(Arrays.asList(my_array));
	System.out.println(list);
}
}


import java.util.Calender;

public class currentTimeAndDate {
	public static void main(String[]args)
	{
		Calender c=Calendar.getIntance();
		System.out.printlnI("current date and time");
		System.out.format("%tb %te,%tY%n",c,c,c);
		System.out.format("%tl:%tM %tp%n", c, c, c);
		
	}

}

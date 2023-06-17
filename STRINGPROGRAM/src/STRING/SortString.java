package STRING;

public class SortString {
	public static void main(String[]args) {
		String []fdname= {"anil","sunil","prakash","amrit","santosh"};
		for(int i=0;i<fdname.length-1;i++)
		{
			for(int j=i+1;j<fdname.length;i++) {
			
				if(fdname[i].compareTo(fdname[j])>1)
				{
				String temp;
				temp=fdname[i];
				fdname[i]=fdname[j];
				fdname[j]=temp;
				
				}
				
				
			}
			
		}
		for(String i:fdname)
		System.out.println(i);
			
		}

}

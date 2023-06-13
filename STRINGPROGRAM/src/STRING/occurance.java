package STRING;

public class occurance {
	public static void main(String[]args) {
		String str="hello ,world";
		int firstO=str.indexOf('o');
		int lastO=str.lastIndexOf('o');
		int firstcomm=str.indexOf(',');
		int lastcomm=str.lastIndexOf(',');
		
		System.out.println("index of('o'):-"+firstO);
		System.out.println("index of('O'):-"+lastO);
		System.out.println("index of(','):-"+firstcomm);
		System.out.println("index of(','):-"+lastcomm);
		
	}

}


public class MyOOP {
	
	public static void main(String[] args) {
		delimiter = "-----------";
		
		//..
		PrintA("");
		printB("");
		
		//..
		delimiter = "**********";
		printB("");
		PrintA("");
		
		//..
		

	}
	
	public static String delimiter= "";
	
	public static void printB(String delimiter) {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("AB");
	}

	public static void PrintA(String delimiter) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
	}

}

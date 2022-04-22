//import java.util.Scanner;

public class WhyMethod {
	
	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
		
	}
	
	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}
	
	
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	public static void main(String [] args) {
//			
//		//100000000
//		printTwoTimesA();
//		
//		//100000000
//		printTwoTimesA();
//		
//		//100000000
//		printTwoTimesA();
//		
//		//print differently.
//		printTwoTimesB();
//		
		//Scanner sc = new Scanner(System.in);
		printTwoTimes("a", "-");
		printTwoTimes("b", "!");
		printTwoTimes("c", "@");
		printTwoTimes("d", "$");
	}

}

import java.util.Scanner;


public class baekjoon {
//
//	
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		int result = A + B;
//		
//		if( 0<A && A<10) {
//			if ( 0<B && B<10) {
//			System.out.println(result);
//			sc.close();
//			}
//		}
//	}
//}
//
	
////public class Main{
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		double A = sc.nextDouble();
//		double B = sc.nextDouble();
//		
//		//int A = Double.parseDouble(A);
//		
//		double result = A/B;
//		
//		if(0< A && A <10 ){
//			if(0< B && B<10) {
//				System.out.println(result);
//			} 
//		}	
//	}
//}


//
//public static void main(String [] args) {
//	
//	Scanner sc = new Scanner(System.in);
//	
//	int A = sc.nextInt();
//	int B = sc.nextInt();
//	
//	//int A = Double.parseDouble(A);
//	
//	int result1 = A+B;
//	int result2 = A-B;
//	int result3 = A*B;
//	int result4 = A/B;
//	int result5 = A%B;
//	
//	if(1<= A && A <=10000 ){
//		if(1<= B && B<=10000) {
//			System.out.println(result1);
//			System.out.println(result2);
//			System.out.println(result3);
//			System.out.println(result4);
//			System.out.println(result5);
//		} 
//	}	
//}



//public class Main{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//	
//		String id = sc.next();
//		
//		if(id == id) {
//			System.out.println(id+"??!");
//		}
		
//	}
//}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		int result = y-543;
		
		if( 1000<= y && y <= 3000) {
			System.out.println(result);
		} else {
			System.out.println("you saw the wrong numerical value on the screen");
		}
	}
}
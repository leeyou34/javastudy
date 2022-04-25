public class MyOOP {
	
	public static void main(String[] args) {
		
		Print p1 = new Print();
		p1.delimiter = "****";
		p1.A();
		p1.B();
		p1.A();
		
		Print.delimiter = "-----------";
		p1.A();
		p1.B();
		
		//..
		Print.delimiter = "**********";
		p1.B();
		p1.A();
		
		//..
		

	}
}


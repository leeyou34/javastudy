import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8)); // put the numerical value into the floor when there is decimal values
		System.out.println(Math.ceil(1.8)); // put the numerical value upto the ceil when there is decimal values.
	
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("what's up?");
		f2.write(" filewriter2");
		f2.close();
	}

}

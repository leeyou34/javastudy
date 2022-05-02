package code;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) throws IOException {
		FileWriter f = null;
		try {
		
			f = new FileWriter("data.txt");
			f.write("Hello man");
			//f.close();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch(IOException e ) {
					e.printStackTrace();
				}
			}
		}
	}

}

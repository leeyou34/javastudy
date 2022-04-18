
public class ArrayTest {

	public static void main(String[] args) {
		int [] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		int sum =0;
		for (int number =0; number<=numbers.length; number++) {
			sum+=number;
				double average;
				int alen = numbers.length;
				average = (double)sum /alen;
				
				System.out.println("ÇÕ = "+ sum);
				System.out.println("Æò±º = " + average);
		}
	}

}

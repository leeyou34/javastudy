class Accounting {
		public static double valueOfSupply = 10000.0;
		public static double vatRate = 0.1;
		public static double getVAT() {
			return valueOfSupply * vatRate;
		}
		public static double getTotal() {
			return valueOfSupply + getVAT();
		}
}


public class AccountingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		
		System.out.println("Value of supply: " + a1.valueOfSupply);
		System.out.println("Value of supply: " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("TOTAL : " + a1.getTotal());
		System.out.println("TOTAL : " + a2.getTotal());
		
		
		
	}

}

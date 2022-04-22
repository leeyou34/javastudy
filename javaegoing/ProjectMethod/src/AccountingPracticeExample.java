import java.util.Scanner;

public class AccountingPracticeExample {
	//field area
	
	static double valueOfSupply;
	static double vatRate = 0.1;
	static double expenseRate = 0.3;
	
	//method area
	public static double getVat() {
		return valueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVat();
	}
	
	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public static void print() {

		System.out.println("===== result of accounting");
		System.out.println("Value of Supply: " + valueOfSupply);
		System.out.println("VAT: " + getVat());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income: " + getIncome());
		
		
	}
	
	//main area
	public static void main(String[] args) {
		System.out.println("please input value into the system to check calculation.");
		
		Scanner sc = new Scanner(System.in);
		valueOfSupply=sc.nextDouble();
		
		print();
		

	}
	
	
	

}

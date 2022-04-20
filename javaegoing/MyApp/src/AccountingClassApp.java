import java.util.Scanner;

class Accounting {
	
	// field 부분
	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;
	
	// method 부분
	public static void print() { // print method 안에 어떤 동작들을 할 것인지 정리 되어있다.
		
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		double dividend1 = getDividend1();
		double dividend2 = getDividend2();
		double dividend3 = getDividend3();
		
		System.out.println("=====================================");
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : "+ dividend1);
		System.out.println("Dividend1 : "+ dividend2);
		System.out.println("Dividend1 : "+ dividend3);
		System.out.println("=====================================");
		
	}

	public static double getDividend3() { // 프린트 메소드 내에 있는 메소드들을 정리했다.
		return getIncome() * 0.2;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}

	public static double getDividend1() {
		return getIncome() * 5;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	// this part is method.
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
}
	

public class AccountingClassApp {

	
	public static void main(String [] args) { // 메인 메소드에선 동작만 할 수 있는 것들을 간략하게 정리 했다.
	
		System.out.println("In order to find out Accounting status, please input the \"value of supply\"");
		Scanner sc = new Scanner(System.in);
		
		Accounting.valueOfSupply = sc.nextDouble();
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
	}
}


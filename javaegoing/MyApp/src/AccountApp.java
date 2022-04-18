import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
/*
		System.out.println("Value of supply : " + 10000.0);
		System.out.println("VAT : " + (10000.0*0.1));
		System.out.println("Total : " + (10000.0 + (10000.0*0.1)));
		System.out.println("Expense : " + (10000.0*0.3));
		System.out.println("Income : " + (10000.0 - (10000.0*0.3)));
		System.out.println("Dividend1 : "+(10000.0 - (10000.0*0.3))*0.5);
		System.out.println("Dividend1 : "+(10000.0 - (10000.0*0.3))*0.3);
		System.out.println("Dividend1 : "+(10000.0 - (10000.0*0.3))*0.2);
*/
		System.out.println("In order to find out Accounting status, please input the \"value of supply\"");
		Scanner sc = new Scanner(System.in);
		
		double valueOfSupply= sc.nextDouble();
		double vatRate =0.1;
		double expenseRate =0.3;
		
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
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

}

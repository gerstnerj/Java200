package com.exercises.loans;

public class LoanCreationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan carLoan = new Loan("ABC123", 14000, 8.75, 60);
		Loan carLoan2 = new Loan("ABC123", 14000, 8.75, 60);
//		CarLoan carLoan = new CarLoan("Dodge","Viper","viper0001", 84885, 9.3, 60);
		
		
		System.out.println(carLoan);
		System.out.println(carLoan2);
		
		System.out.println(carLoan==carLoan2);
		System.out.println(carLoan.equals(carLoan2));
		
		System.out.println("carLoan hash: " + carLoan.hashCode());
		System.out.println("carLoan2 hash: " + carLoan2.hashCode());
		
//		System.out.println(carLoan.toString());		//same as printing the carLoan
//		
//		carLoan.applyPayment(500);
//		System.out.println("payment of $500.00");
//		System.out.println(carLoan);
//
//		carLoan.applyPayment(50);
//		System.out.println("payment of $50.00");
//		System.out.println(carLoan);
	
	}

}

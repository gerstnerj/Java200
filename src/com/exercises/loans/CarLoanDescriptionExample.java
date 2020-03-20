package com.exercises.loans;

public class CarLoanDescriptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan1 = new Loan("L001234",100000,4.5,60);
		Loan loan2 = new Loan("L001234",100000,4.5,60);
		
		CarLoan carLoan = new CarLoan("Dodge","Viper","XYZ998",84885,9.3,60);
	 	System.out.println(carLoan);	
		carLoan.applyPayment(400);
		System.out.println(carLoan);
		
	}

}

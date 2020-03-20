package com.exercises.loans;

public class CarLoan extends Loan {

	private String make = new String(); //"Dodge";
	private String model = new String(); //"Viper";
	
	public CarLoan(String setMake, String setModel, String loanNumber, double principal, double interestRate, int monthsLeft) {
		super(loanNumber, principal, interestRate, monthsLeft);
		// TODO Auto-generated constructor stub
		make = setMake;
		model = setModel;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		System.out.print(
		return ("This is a loan for a " + make + " " + model + " "
				+ super.toString());
	}
	
}

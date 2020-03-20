package com.exercises;

public class MathPracticeInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rVal = Math.random();
		
		double zeroToFifty = rVal * 50;
		
		double rounded = Math.round(zeroToFifty);
		System.out.println("In Main: Random double value 0-50 is " + zeroToFifty);
//		System.out.println("In Main: Rounded double value is " + Math.round(zeroToFifty));
		System.out.println("In Main: Rounded double value is " + rounded);
		System.out.println("In Main: Random double value 0-100 is " + zeroToFifty*2 );
		System.out.println("In Main: Rounded double value is " + Math.round(zeroToFifty*2));
		

	}

	
}

package com.exercises;

public class MathPracticeDoublesWithHelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		upperLimitRandom(50);

		System.out.println();

		upperLimitRandom(100);

		System.out.println();

		upperLimitRandom(50000);
		/*
		 * double rounded100 = Math.round(zeroToFifty*2); int rounded100Int =
		 * (int)(zeroToFifty*2);
		 * 
		 * System.out.println("In Main: Random double value 0-100 is " + zeroToFifty*2);
		 * System.out.println("In Main: int value is " + rounded100Int);
		 * System.out.println("In Main: Rounded double value is " + rounded100);
		 */

	}

	private static void upperLimitRandom(int limit) {
		double rVal = Math.random();

		double zeroToFifty = rVal * limit;

		double rounded = Math.round(zeroToFifty);
		int roundedInt = (int) zeroToFifty;

		System.out.println("In Main: Random double value 0-" + limit + " is " + zeroToFifty);
		System.out.println("In Main: int value is " + roundedInt);
		System.out.println("In Main: Rounded double value is " + rounded);

	}

}

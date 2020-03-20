package com.exercises;

public class MathPracticeDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rVal = Math.random();
		
		double zeroToFifty = rVal * 50;
		
		double rounded = Math.round(zeroToFifty);
		int roundedInt = (int)zeroToFifty;
				
		double rounded100 = Math.round(zeroToFifty*2);
		int rounded100Int = (int)(zeroToFifty*2);
		
		System.out.println("In Main: Random double value 0-50 is " + zeroToFifty);

		System.out.println("In Main: int value is " + roundedInt);
		
		System.out.println("In Main: Rounded double value is " + rounded);
		
		System.out.println("In Main: Random double value 0-100 is " +  zeroToFifty*2);

		System.out.println("In Main: int value is " + rounded100Int);
		
		System.out.println("In Main: Rounded double value is " + rounded100);
		

	}

	
}

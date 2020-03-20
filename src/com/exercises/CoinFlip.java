package com.exercises;

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random myRandomObj = new Random();
		
		for (int i=0; i<5; i++) {
			boolean coinValue = myRandomObj.nextBoolean();
			
			if (coinValue) {
//				System.out.println('H');
				System.out.println("Heads");
			}
			else {
				System.out.println("Tails");
			}
			
		}
		
	}

}

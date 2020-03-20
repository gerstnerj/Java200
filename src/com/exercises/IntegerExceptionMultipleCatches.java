package com.exercises;

public class IntegerExceptionMultipleCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		additionofnumbers(args);
		System.out.println("\nReally.");
	}

	public static void additionofnumbers(String[] args) {
		try {
			int int1 = new Integer(args[0]);
			int int2 = new Integer(args[1]);
			System.out.println("Your two input integers sum to: " + (int1+int2));
		}
		catch(NumberFormatException e) {
			System.out.println("You must only enter two INTEGERS.");
			System.out.println("Original error:" + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You must enter TWO integers.");
			System.out.println("Original error:" + e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("You must enter TWO integers.");
			System.out.println("Original error:" + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Error, program only designed to sum two entered integers.");
			System.out.println("Original error:" + e.getMessage());
		}
		finally {
			System.out.println("\nEnd of program.");
		}
	}
	
}

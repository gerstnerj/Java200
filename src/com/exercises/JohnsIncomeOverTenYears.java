package com.exercises;

public class JohnsIncomeOverTenYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double wage = 18.25;
		int annual_hours = 40 * 52;
		int holiday_hours = 12 * 8;

		// Calculate hours John works in a year.
		annual_hours = annual_hours - holiday_hours;

		// Calculate salary John earns in a year.
		double salary = wage * annual_hours;

		double raise = 0.04;

		for (int i = 1; i <= 10; i++) {

			// Moved raise to end of loop
//			if (i > 1) {
//			wage = wage * (1+raise);
//			}
			salary = wage * annual_hours;

			System.out.print("John makes $" + salary + " in the ");

			switch (i) {
			case 1:
				System.out.print(i + "st");
				break;
			case 2:
				System.out.print(i + "nd");
				break;
			case 3:
				System.out.print(i + "rd");
				break;
			default:
				System.out.print(i + "th");
				break;
			}

			System.out.println(" year");

			wage = wage * (1 + raise);
		}

	}

}

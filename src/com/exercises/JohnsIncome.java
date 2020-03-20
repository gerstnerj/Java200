package com.exercises;

public class JohnsIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wage = 18.25;
		int annual_hours = 40 * 52;
		int holiday_hours = 12 * 8;
		
		//Calculate hours John works in a year.
		annual_hours = annual_hours - holiday_hours;
		
		//Calculate salary John earns in a year.
		double salary = wage * annual_hours;
		
		System.out.println("John makes $" + salary + " per year.");
	}

}

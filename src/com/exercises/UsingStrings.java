package com.exercises;

public class UsingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String masterstring = "hello, jane!";
		incrementalprint(masterstring);
	}

	private static void incrementalprint(String inputstring) {
		for(int i=1; i<=inputstring.length(); i++) {
			String display = inputstring.substring(0,i);
			if(i%2==0) {
				display=display.toUpperCase();
			}
			System.out.println(display);
		}
	}
}

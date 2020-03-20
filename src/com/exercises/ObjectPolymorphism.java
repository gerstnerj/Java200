package com.exercises;

import java.util.*;
//import java.util.Date;
//import java.util.GregorianCalendar;

public class ObjectPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		System.out.println(object.toString());
		
		object = (String)"Test String";
		System.out.println(object.toString());
		
		object = new Date();
		System.out.println(object.toString());
		
		object = new GregorianCalendar();
		System.out.println(object.toString());
		

	}

}

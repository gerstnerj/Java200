package com.exercises.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> mySet = new HashSet<>();
		mySet.add("two");
		mySet.add("two");
		mySet.add("one");
		mySet.add("five");
		mySet.add("four");
		mySet.add("three");
		System.out.println(mySet);
		
		Set<String> myTreeSet = new TreeSet<>(mySet);
		System.out.println(myTreeSet);
	}

}

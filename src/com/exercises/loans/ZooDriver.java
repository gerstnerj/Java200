package com.exercises.loans;

import java.util.Random;

public class ZooDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Animal randomAnimal;
		
		for (int i=0; i<5; i++) {
			if(random.nextBoolean()) {
				randomAnimal = new Lion("Leo");
			}else {
				randomAnimal = new Snake("Kaa");
			}
			
			System.out.print(randomAnimal.getName() + " says ");
			randomAnimal.makeSound();
		}
	}

}

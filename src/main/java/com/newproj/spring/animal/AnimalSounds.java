package com.newproj.spring.animal;

public class AnimalSounds {
	private IAnimal animal;
	
	public AnimalSounds(IAnimal animal) {
		this.animal = animal;
	}
	
	public void getAnimalSound() {
		System.out.println("This animal sounds like: " + animal.makeSound());
	}
	
	
	
	
	
}

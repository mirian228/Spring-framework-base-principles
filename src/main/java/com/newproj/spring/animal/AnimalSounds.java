package com.newproj.spring.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalSounds {
	
	//@Autowired
	//@Qualifier("cat")
	private IAnimal animal;

	@Autowired
	public AnimalSounds(@Qualifier("cat") IAnimal animal) {
		this.animal = animal;
	}
	
	public void getAnimalSound() {
		System.out.println("This animal sounds like: " + animal.makeSound());
	}
	
	
	
	
	
}

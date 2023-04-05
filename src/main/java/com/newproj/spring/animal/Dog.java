package com.newproj.spring.animal;

public class Dog implements IAnimal {

	@Override
	public String makeSound() {
		return "Woof";
	}

}

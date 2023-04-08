package com.newproj.spring.animal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements IAnimal {

	@Override
	public String makeSound() {
		return "Woof";
	}

}

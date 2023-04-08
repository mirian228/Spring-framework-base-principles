package com.newproj.spring.animal;

import org.springframework.stereotype.Component;

@Component
public class Pig implements IAnimal {

	@Override
	public String makeSound() {
		return "oink";
	}

}

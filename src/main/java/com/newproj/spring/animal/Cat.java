package com.newproj.spring.animal;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements IAnimal {

	@Override
	public String makeSound() {
		return "Meow";
	}

}

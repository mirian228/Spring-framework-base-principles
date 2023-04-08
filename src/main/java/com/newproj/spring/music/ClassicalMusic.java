package com.newproj.spring.music;

import java.util.Arrays;

public class ClassicalMusic implements IMusic {
	String[] classicalMusic = {"Bach's Brandenburg Concertos", "Tchaikovsky's Symphony", "Debussy's Clair de Lune" };
	
	
	//Factory pattern uses private constructor
	private ClassicalMusic() {
		
	}
	
	//Static initializer (Part of factory pattern) which returns instance of classical music.
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
	
	
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction");
	}
	
	
	@Override
	public String[] getSong() {
		return classicalMusic;
	}

	@Override
	public int getArrayLength() {
		return classicalMusic.length;
	}

	@Override
	public String toString() {
		return "ClassicalMusic [classicalMusic=" + Arrays.toString(classicalMusic) + "]";
	}

}

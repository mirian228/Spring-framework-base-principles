package com.newproj.spring.music;

public class ClassicalMusic implements IMusic {
	
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
	public String getSong() {
		return "Hungarian Rhapsody";
	}

}

package com.newproj.spring.music;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component("musicBeanJazz")
public class JazzMusic implements IMusic {
	
	String[] jazzMusics = {"Take The A Train", "What a Wonderful World", "The Girl From Ipanema"};
	
	@Override
	public String[] getSong() {
		return jazzMusics;
	}

	@Override
	public int getArrayLength() {
		return jazzMusics.length;
	}

	@Override
	public String toString() {
		return "JazzMusic [jazzMusics=" + Arrays.toString(jazzMusics) + "]";
	}
	
	

}

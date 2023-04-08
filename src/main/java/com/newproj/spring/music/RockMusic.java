package com.newproj.spring.music;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component("musicBeanRock")
public class RockMusic implements IMusic {
	String[] rockMusics = {"Wind cries Mary", "Bohemian Rhapsody", "Stairway to Heaven" };
	
	@Override
	public String[] getSong() {
		return rockMusics;
	}

	@Override
	public int getArrayLength() {
		return rockMusics.length;
	}

	@Override
	public String toString() {
		return "RockMusic [rockMusics=" + Arrays.toString(rockMusics) + "]";
	}

}

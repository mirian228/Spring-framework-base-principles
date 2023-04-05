package com.newproj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newproj.spring.animal.AnimalSounds;
import com.newproj.spring.music.MusicPlayer;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//IMusic music = context.getBean("musicBean", IMusic.class);
		//MusicPlayer musicPlayer = new MusicPlayer(music);
		
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());
		
	
		
	
		AnimalSounds animalSounds = context.getBean("animalSounds", AnimalSounds.class);
		animalSounds.getAnimalSound();
		
		
		context.close();

		
	}
}
